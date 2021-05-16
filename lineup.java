// https://open.kattis.com/problems/lineup

import java.util.Scanner;

public class lineup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        boolean isDescending = true, isAscending = true;
        for (int i = 0; i < n - 1; i++) {
            isDescending = isDescending && (arr[i].compareTo(arr[i + 1]) > 0);
            isAscending = isAscending && (arr[i].compareTo(arr[i + 1]) < 0);
        }
        String out = isAscending ? "INCREASING" : isDescending ? "DECREASING" : "NEITHER";
        System.out.println(out);
    }
}
