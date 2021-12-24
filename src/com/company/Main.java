package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Abc x = new Abc();
        Bcd y = new Bcd();
        y.toString();
        x.toString();
        System.out.println("o1");
        System.out.println("o2");
        x.x1();
        x.x1();
    }
}

class Bcd{}

class Abc{

    Abc(){}

    void x1 () {
        try{x2();}catch(IOException e){
            System.out.println("t1");
            System.out.println("t1.2");
            System.out.println("ts1");
        }
    }
    void x2 () throws IOException{
        throw new IOException();
    }
}