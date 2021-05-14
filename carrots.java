// https://open.kattis.com/problems/carrots

import java.util.Scanner;

public class carrots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        for (int i = 0; i < n; i++)
            scanner.nextLine();
        scanner.close();
        System.out.println(p);
    }
}
