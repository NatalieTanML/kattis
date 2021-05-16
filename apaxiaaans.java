// https://open.kattis.com/problems/apaxiaaans

import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c = scanner.nextLine().toCharArray();
        scanner.close();
        String out = Character.toString(c[0]);
        for (int i = 0; i < c.length; i++) {
            if (out.charAt(out.length() - 1) != c[i]) {
                out += c[i];
            }
        }
        System.out.println(out);
    }
}
