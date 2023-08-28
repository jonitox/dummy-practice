package com.company;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class Main {


    public static void main(String[] args) throws UnknownHostException {

        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[32]; // 256비트 키
        secureRandom.nextBytes(key);

        // 키를 Base64 등의 형식으로 인코딩하여 저장 또는 사용
        String encodedKey = java.util.Base64.getUrlEncoder().encodeToString(key);
        System.out.println(encodedKey);
        String samlRequest = "jVLJTsMwEP2VyHcnaZqGYjVFBYRAKqI0KQduU2eAiGRcPE7E52O6iMKh4mj7bTPPk4vPtgl6tFwbysUgjEWApE1V02suVuWNHIuL6YShbZKNmnXujZb40SG7wBOJ1e4lF50lZYBrVgQtsnJaFbP7uUrCWG2scUabRgQzZrTOW10Z4q5FW6Dta42r5TwXb85tVBRV2EttiFC7z5DAZ9PGbkJt2qgfRN9%2BkYamWYN%2BF8G1T1ITuG36bwH2CsQsvcof8pZZ%2BLkaLOpXeqC9twhujNW4nS0XL9Cwv7q7zsVs%2BZhiBlWiZZxmqUzTdSbX59VQwjAD1NXZYJSNPJYXwFz3%2BMNm7vCO2AG5XCRxMpTxWCZJGWcqSdUoDkfj9FkEi%2F1iLmvaLfzUFtc7EKvbslzIxUNRiuDpUJwHiH1Nautuj%2Fs5LQyHUsT0%2FxW06KACB5Po2HS6P%2F7%2BKtMv";
        String decodedAndDecompressed = InflateAndDecoder.inflateAndBase64Decode(InflateAndDecoder.uriDecode(samlRequest, StandardCharsets.ISO_8859_1));
        System.out.println(decodedAndDecompressed);
//
//        System.out.println("########");
////        String xml = decodedAndDecompressed;
//        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><saml2p:AuthnRequest xmlns:saml2p=\"urn:oasis:names:tc:SAML:2.0:protocol\" AssertionConsumerServiceURL=\"http://dev-connectx.navercorp.com/v1/saml/callback\" Destination=\"https://nss-dev.navercorp.com/saml/SingleSignOnService\" ForceAuthn=\"false\" ID=\"ARQ4a1be83-aa7c-4c6c-ae84-968253cb54e1\" IsPassive=\"false\" IssueInstant=\"2023-07-30T17:32:01.716Z\" ProtocolBinding=\"urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST\" Version=\"2.0\"><saml2:Issuer xmlns:saml2=\"urn:oasis:names:tc:SAML:2.0:assertion\">http://dev-connectx.navercorp.com/v1/saml/metadata</saml2:Issuer></saml2p:AuthnRequest>";
//        String deflatedAndEncode = DeflateAndEncoder.deflateAndEncoded(xml);
//        System.out.println(deflatedAndEncode);
//
//        System.out.println("equal : "+samlRequest.equals(deflatedAndEncode));
    public static void ho() {
        System.out.printf("hey yo");
    }

    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("ho");
        System.out.println("123");
        List<Integer> a = Arrays.asList(1, 2);
        List<Integer> b = Arrays.asList(1, 2);
        System.out.println(a.equals(a));
        System.out.println(a.equals(a));
        System.out.println("hi");
        System.out.printf("hi merges");

    }
}

class Bcd {}

class Abc {

    Abc() {}

    static public void test(String a) {
        System.out.println(a);
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abcd");
        System.out.println("abcded");
        System.out.println("abcdefff");
    }

    public static Integer get() {
        return null;
    }

    void x0() {
        try {x1();} catch (Exception e) {
            System.out.println("# " + e.toString());

        }
    }

    void x1() {
        System.out.printf("hihi");
        x2();
    }

    void x2() {
        System.out.printf("ho");
        throw new RuntimeException();
    }
}


/*





///


 */
