package Ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
            arr2[i] = random.nextInt() % 1000;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}