// https://open.kattis.com/problems/pot

import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            int pow = input % 10;
            int num = (int) Math.floor(input / 10);
            sum = sum + (int) Math.pow(num, pow);
        }
        scanner.close();
        System.out.println(sum);
    }
}
