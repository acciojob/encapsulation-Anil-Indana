package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        rw.setName("Niklaus");
        String ans = rw.getName();
        System.out.println(ans);
    }
}