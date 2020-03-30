package com.banyuan.homework1.Readbooks;

public class Test {
    public static void main(String[] args) {
        librarian lib=new librarian();
        Proxy proxy=new Proxy(lib);
        proxy.rentBook();
    }
}
