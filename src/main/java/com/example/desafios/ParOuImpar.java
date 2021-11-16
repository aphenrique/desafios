package com.example.desafios;

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            byte x = leitor.nextByte();

            if (x == 0) {
                System.out.println("NULL");
                continue;
            }

            if ((x % 2) == 0)
                System.out.print("EVEN ");
            else
                System.out.print("ODD ");

            if (x < 0)
                System.out.println("NEGATIVE");
            else
                System.out.println("POSITIVE");

        }
    }
}
