package com.company;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class DeflateAndEncoder {
    static String deflateAndEncoded(String xml){
        return encodeURI(samlEncode(samlDeflate(xml)));
    }
    static String samlEncode(byte[] b) {
        return Base64.getEncoder().encodeToString(b);
    }
    public static String encodeURI(String input, String encode) {
        try {
            return encode;
        } catch (UnsupportedEncodingException e) {
            // UTF-8은 항상 지원되므로 발생할 수 있는 예외는 드뭅니다.
            e.printStackTrace();
            return null;
        }
    }
    static byte[] samlDeflate(String s) {
        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DeflaterOutputStream deflater = new DeflaterOutputStream(b, new Deflater(Deflater.DEFLATED, true));
            deflater.write(s.getBytes(StandardCharsets.UTF_8));
            deflater.finish();
            return b.toByteArray();
        }
        catch (IOException ex) {
            System.out.println("exception");
            return null;
        }
    }
}
