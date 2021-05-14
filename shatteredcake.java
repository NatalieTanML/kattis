// https://open.kattis.com/problems/shatteredcake

import java.util.Scanner;

public class shatteredcake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int area = 0;
        for (int i = 0; i < n; i++) {
            int wi = scanner.nextInt();
            int li = scanner.nextInt();
            area += wi * li;
        }
        scanner.close();
        System.out.println(area / w);
    }
}
