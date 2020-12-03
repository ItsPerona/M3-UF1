package com.iperona;

import java.util.Scanner;

public class ParaulesRepetides {

    public static void main(String[] args) {

        // Lector
        Scanner lector = new Scanner(System.in);

        // Objectes
        String entrada;
        int entradas = 0;
        int cops;
        String[] guardat = new String[100]; //

        // Demana una nova paraula
        System.out.print("Introdueix paraules separades amb salts de linea:");
        System.out.println();
        while ( entradas != 100) {
            entradas++;
            entrada = lector.next();

            // Guarda la nova paraula en el seu espai corresponent de l'array
            guardat[entradas - 1] = entrada;

            // Reinicia el comptador de cops que ha sortit
            cops = 0;

            // Comprova si l'entrada està repetida 3 cops a qualsevol posicio de l'array
            for (int j = 0; j < guardat.length; j++) {
                if (entrada.equalsIgnoreCase(guardat[j])) {
                    cops++;
                    // Mostra la paraula repetida 3 cops
                    if (cops == 3) {
                        System.out.println("La paraula " + entrada + " s'ha repetit 3 cops.");
                        // Acaba el programa
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Cap paraula ha sigut introduida 3 cops");
    }
}
