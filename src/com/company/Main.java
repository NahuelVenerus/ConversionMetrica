package com.company;

import java.util.Scanner;

public class Main {static double inch = 2.54; // cms
    static double foot = 12 * inch; // 30,48cms
    static double yard = 3 * foot; // 91,44cms
    static int meter = 100; // cms

    private static double calculateInches(int givenNumber){
        return (givenNumber* meter)/inch;
    }
    private static double calculateFeet(int givenNumber){
        return (givenNumber* meter)/foot;
    }
    private static double calculateYards(int givenNumber){
        return (givenNumber* meter)/yard;
    }

    public static void main(String[] args) {
        /*
        Leer una medida en metros e imprimir esta medida expresada en centímetros, pulgadas, pies y yardas. Los factores de conversión son:
        pie = 12 pulgadas
        yarda = 3 pies
        pulgada = 2,54 cm.
        metro = 100 cm.nm
         */

        int metrosRecibidos;

        System.out.println("Dame una distancia en metros y te dire cuanto es en centimetros, pulgadas, pies y yardas");
        int givenNumber;
        Scanner reader = new Scanner(System.in);
        givenNumber = reader.nextInt();
        System.out.println("Pulgadas: " + calculateInches(givenNumber));
        System.out.println("Pies: " + calculateFeet(givenNumber));
        System.out.println("Yardas: " + calculateYards(givenNumber));
    }
}
