package com.company;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("ho");
        List<Integer> a= Arrays.asList(1,2);
        List<Integer> b= Arrays.asList(1,2);
        System.out.println(a.equals(a));
        System.out.println(a.equals(a));
        System.out.println("hi");
        System.out.printf("hi merges");
        System.out.printf("hi cherry");

        IntStream.range(1,100).forEach(System.out::println);
    }
}

class Bcd{}

class Abc{

    Abc(){}
    static public void test(String a){
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

    void x1 () {
        x2();
    }

    void x2() {
        throw new RuntimeException();
    }
}


/*





///


 */
