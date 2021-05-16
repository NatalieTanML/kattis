// https://open.kattis.com/problems/qaly

import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        double qaly = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double q = scanner.nextDouble();
            double y = scanner.nextDouble();
            qaly += q * y;
        }
        scanner.close();
        System.out.printf("%.3f", qaly);
    }
}
