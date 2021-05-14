// https://open.kattis.com/problems/trik

import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        int pos = 1;
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        scanner.close();
        for (char ch : in.toCharArray()) {
            switch (ch) {
                case 'A':
                    pos = pos == 1 ? 2 : pos == 2 ? 1 : pos;
                    break;
                case 'B':
                    pos = pos == 2 ? 3 : pos == 3 ? 2 : pos;
                    break;
                case 'C':
                    pos = pos == 1 ? 3 : pos == 3 ? 1 : pos;
                    break;
                default:
                    break;
            }
        }
        System.out.println(pos);
    }
}
