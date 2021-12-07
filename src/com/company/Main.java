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
    final int a =3;
    Abc(){};

    void x1 () {
        x2();
    }
    void x2 () throws IOException {
        throw new RuntimeException();
    }
}