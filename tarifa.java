// https://open.kattis.com/problems/tarifa

import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = x * (n + 1);
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            sum -= p;
        }
        scanner.close();
        System.out.println(sum);
    }
}
