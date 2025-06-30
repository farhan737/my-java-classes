package com.farhan;

public class App {
    int productid;

    App(int productid) {
        this.productid = productid;
    }

    public static void main(String[] args) {
        App a = new App(19);
        System.out.println(a);
    }
}
