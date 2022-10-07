package Ex1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(sum / 2.);
    }
}