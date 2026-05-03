package projetos.java.atividades;

import java.sql.SQLOutput;

public class aulavariaveis {
    public static void main(String[] args) {
        int age = 100;
        byte numero = (byte) 1000;
        System.out.println("você tem " + age + " anos" );
        System.out.println("você tem " + numero + " anos" );
        /*
        Java possui esses tipos primitivos:
        int, douple, float, char, byte, short, long, boolean.
         */
        String nome = "Usado para textos";
        // String é uma classe por isso começa Maiscula
        System.out.println(nome);
        var eu = 1000;;
    }
}