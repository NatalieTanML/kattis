// https://open.kattis.com/problems/spavanac

import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int newm = m < 45 ? 60 + (m - 45) : m - 45;
        int newh = m < 45 ? h == 0 ? 23 : h - 1 : h;
        System.out.println(newh + " " + newm);
    }
}
