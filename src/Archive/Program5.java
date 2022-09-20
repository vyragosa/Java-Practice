package Archive;

import java.util.Arrays;
import java.util.Scanner;
public class Program5 {
    public static int[] remove(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, index);
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr)+ "\nLength: " + arr.length);
        n = scanner.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                arr = remove(arr, i);
                i = i - 1;
            }


        }
        System.out.println(Arrays.toString(arr) + "\nLength: " + arr.length);
        n = scanner.nextInt();
        for(int i = 0; i < arr.length; i++) {
            String s = Integer.toString(arr[i]);
            if (s.substring(s.length() - 1).equals(Integer.toString(n))) {
                arr = remove(arr, i);
                i = i - 1;
            }

        }
        System.out.println(Arrays.toString(arr)+ "\nLength: " + arr.length);
    }
}
