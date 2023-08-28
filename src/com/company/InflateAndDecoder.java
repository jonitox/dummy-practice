package com.company;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class InflateAndDecoder {

    public static String inflateAndBase64Decode(String input) {
        try {
            // Decode the Base64 string
            byte[] compressedBytes = Base64.getDecoder().decode(input);

            // Decompress the compressed bytes
//            byte[] decompressedBytes = decompress(compressedBytes);
            return uriDecode(samlInflate(compressedBytes), StandardCharsets.ISO_8859_1);


            // Convert bytes to string using UTF-8 encoding
//            return new String(decompressedBytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String uriDecode(String source, Charset charset) {
        int length = source.length();
        if (length == 0) {
            return source;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream(length);
        boolean changed = false;
        for (int i = 0; i < length; i++) {
            int ch = source.charAt(i);
            if (ch == '%') {
                if (i + 2 < length) {
                    char hex1 = source.charAt(i + 1);
                    char hex2 = source.charAt(i + 2);
                    int u = Character.digit(hex1, 16);
                    int l = Character.digit(hex2, 16);
                    if (u == -1 || l == -1) {
                        throw new IllegalArgumentException("Invalid encoded sequence \"" + source.substring(i) + "\"");
                    }
                    baos.write((char) ((u << 4) + l));
                    i += 2;
                    changed = true;
                }
                else {
                    throw new IllegalArgumentException("Invalid encoded sequence \"" + source.substring(i) + "\"");
                }
            }
            else {
                baos.write(ch);
            }
        }
        return (changed ? new String(baos.toByteArray(), charset) : source);
    }
    public static String samlInflate(byte[] data) {
        try {
            ByteArrayInputStream b = new ByteArrayInputStream(data);
            InflaterInputStream inflater = new InflaterInputStream(b, new Inflater(true));

            ByteArrayOutputStream result = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inflater.read(buffer)) > 0) {
                result.write(buffer, 0, length);
            }

            inflater.close();
            result.close();

            return result.toString(String.valueOf(StandardCharsets.UTF_8));
        } catch (IOException ex) {
            System.out.println("error");
            return null;
        }
    }
}
