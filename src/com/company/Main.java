package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Abc x = new Abc();
        Bcd y = new Bcd();
        y.toString();
        x.toString();
        System.out.println("oh!");
        System.out.println("oh2");
        x.x1();

    }
}

class Bcd{}

class Abc{

    Abc(){}

    void x1 () {
        try{x2();}catch(IOException e){
            System.out.println("reset");
            System.out.println("ch1");
            System.out.println("ch2");
            System.out.println("ch3");
        }
    }
    void x2 () throws IOException{
        ;;
        ;;
        throw new IOException();
    }
}