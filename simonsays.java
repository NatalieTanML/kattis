// https://open.kattis.com/problems/simonsays

import java.util.Scanner;

public class simonsays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.startsWith("Simon says")) {
                System.out.println(s.substring("Simon says".length()));
            }
        }
        scanner.close();
    }
}
