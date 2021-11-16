package com.example.desafios;

import java.util.Scanner;

public class TrigoNoTabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.printf("%d kg%n", calcularKilos(x)); // Complete o código aqui.
        }
        sc.close();
    }

    static long calcularKilos(int casasDoTabuleiro) {
        double kilos;
        double totalDeGraos = 1;

        for (int i = 1; i <= casasDoTabuleiro; i++) {
            totalDeGraos *= 2;
        }

        // A cada 12 grãos, o monge terá 1 grama
        // a cada 1000 gramas, temos 1 kg
        kilos = Math.floor((totalDeGraos / 12) / 1000);

        return (long) kilos;
    }
}
