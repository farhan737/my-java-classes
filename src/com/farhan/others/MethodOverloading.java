package com.farhan.others;

public class MethodOverloading {
    public int ovMethod(char ch) {
        return (int) ch;
    }

    public char ovMethod(int ch) {
        return (char) ch;
    }

}
