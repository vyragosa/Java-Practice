import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int l = 0; l < n; l++) {
            arr[l] = scanner.nextInt();
        }
        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        System.out.println(sum + " ");
        sum = 0;
        int j = 0;
        while(j < arr.length) {
            sum += arr[j];
            j++;
        }
        System.out.println(sum + " ");
        sum = 0;
        j = 0;
        do {
            sum += arr[j];
            j++;
        } while (arr.length != j);
        System.out.println(sum + " ");
    }
}