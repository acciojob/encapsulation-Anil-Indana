package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        // rw.name = "Niklaus";
        // System.out.println(rw.name);
        // name has private access in com.driver.RWOnly
        rw.setter("Niklaus");
        System.out.println(rw.getter());
    }
}