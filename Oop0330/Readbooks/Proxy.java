package com.banyuan.homework1.Readbooks;

public class Proxy {
    private librarian lib;

    public Proxy() {
    }

    public Proxy(librarian lib) {
        this.lib = lib;
    }

    public librarian getLib() {
        return lib;
    }

    public void setLib(librarian lib) {
        this.lib = lib;
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "lib=" + lib +
                '}';
    }
    public void rentBook(){
        lib.rentBook();
    }
}
