package com.rajnandani.dsa;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
        	System.out.println("Enter the car");
            int C = sc.nextInt();
            System.out.println("Enter the bike");
            int B = sc.nextInt();

            long tyres = 4L * C + 2L * B;
            System.out.println("Number of tyres is :" + tyres);
        }

        sc.close();
    }
}