// https://open.kattis.com/problems/r2

import java.util.Scanner;

public class r2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int s = scanner.nextInt();
        scanner.close();
        System.out.println(s * 2 - r1);
    }
}
