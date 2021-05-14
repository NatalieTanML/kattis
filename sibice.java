// https://open.kattis.com/problems/sibice

import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        double d = Math.sqrt(w * w + h * h);
        for (int i = 0; i < n; i++) {
            int len = scanner.nextInt();
            if (len <= d) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
        scanner.close();
    }
}
