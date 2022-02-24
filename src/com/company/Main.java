package com.company;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime t = ZonedDateTime.now();
        System.out.println(t);
        System.out.println(t.toString());
        int a=3;
        int b = 3;
        int c=1;
        int d =3;
    }
}

class Bcd{}

class Abc{

    Abc(){}
    static public void test(String a){
        System.out.println(a);
    }
    void x0() {
        try{x1();} catch(Exception e){
            System.out.println("# "+ e.toString());

        }
    }

    void x1 () {
        x2();
    }
    void x2 (){
        throw new RuntimeException();
    }
}