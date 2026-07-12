package loops;

import java.util.Scanner;

public class CountingInReverse {

    public static void main(String[] args) {

        // Print counting from n to 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}