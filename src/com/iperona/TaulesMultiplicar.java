package com.iperona;

import java.util.Random;
import java.util.Scanner;

public class TaulesMultiplicar {

    public static void main(String[] args){

        // Objectes
        Random aleatori = new Random();
        int[] nums = new int[2];
        int errades = 0, encerts = 0;
        int llançaments = 0;
        int entrada;

        // Comprovar Requisits
        while ( errades != 3 && llançaments != 100) {
            // Generar Randoms
            for (int i = 0; i < 2; i++) {
                nums[i] = aleatori.nextInt(10);
            }

            Scanner lector = new Scanner(System.in);

            // Demana la resposta a l'usuari
            System.out.print(nums[0] + "x" + nums[1] + "= ");
            // Comprova l'entrada de dades
            if (!lector.hasNextInt()) {
                System.out.print("Error: El valor introduit no es un numero enter.");
                System.out.println();
                errades++;
            } else {
                // Comprova el resultat
                entrada = lector.nextInt();
                if (entrada == nums[0] * nums[1]) {
                    encerts++;
                } else {
                    errades++;
                }
            }
            // Missatges finals
            if ( errades == 3) {
                System.out.println("Has fet " + encerts + " operacions bé abans de cometre les tres errades.");
            }
            llançaments++;
            if ( llançaments == 100) {
                System.out.println("Ja has fet els 100 llançaments.");
                System.out.println("Encerts: " + encerts);
                System.out.println("Errades: " + errades);
            }
        }
    }
}
