// https://open.kattis.com/problems/twostones

import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        String out = num % 2 == 0 ? "Bob" : "Alice";
        System.out.println(out);
    }
}
