// https://open.kattis.com/problems/cold

import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            count = temp < 0 ? count + 1 : count;
        }
        scanner.close();
        System.out.println(count);
    }
}
