package com.backend;
import org.apache.log4j.Logger;
public class Test {
    private static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args){
        Leon leon1 = new Leon("Albolito de navidad", 13, false);
        leon1.correr();
        leon1.esMayorA10();
        leon1.machoAlfa();

        System.out.println("-------------------");

        Leon leon2 = new Leon("Balón de oro", -30, true);
        leon2.correr();
        leon2.esMayorA10();
        leon2.machoAlfa();

        System.out.println("-------------------");

        Tigre tigre1 = new Tigre("Tony", -70);
        tigre1.correr();
        tigre1.esMayorA10();

        System.out.println("-------------------");

        Tigre tigre2 = new Tigre("Cachalay", 450);
        tigre2.correr();
        tigre2.esMayorA10();

    }
}
