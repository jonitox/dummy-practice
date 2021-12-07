package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Abc x = new Abc();
        x.toString();
        System.out.println("oh!");

        x.x1();

    }
}


class Abc{

    Abc(){}

    void x1 () {
        try{x2();}catch(IOException e){
            System.out.println("yeah!");
            System.out.println("!!");
        }
    }
    void x2 () throws IOException{
        throw new IOException();
    }
}