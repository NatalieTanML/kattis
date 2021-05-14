// https://open.kattis.com/problems/timeloop

import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= num; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}