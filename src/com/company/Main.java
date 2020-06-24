package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Leer una medida en metros e imprimir esta medida expresada en centímetros, pulgadas, pies y yardas. Los factores de conversión son:
        pie = 12 pulgadas
        yarda = 3 pies
        pulgada = 2,54 cm.
        metro = 100 cm.nm
         */
        double inch = 2.54; // cms
        double foot = 12 * inch; // 30,48cms
        double yard = 3 * foot; // 91,44cms
        int meter = 100; // cms

        System.out.println("Dame una distancia en metros y te dire cuanto es en centimetros, pulgadas, pies y yardas");
        int givenMeters;
        Scanner reader = new Scanner(System.in);
        givenMeters = reader.nextInt();
        System.out.println("Pulgadas: " + (givenMeters* meter)/inch);
        System.out.println("Pies: " + (givenMeters* meter)/foot);
        System.out.println("Yardas: " + (givenMeters* meter)/yard);
        System.out.println("Centimetros: " + meter*100);
    }
}
