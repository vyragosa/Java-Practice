import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int sys = scanner.nextInt();
        int a = scanner.nextInt();
        while(a > 0) {
            int temp = a % sys;
            if (temp >= 10) {
                result.insert(0, (char) ('A' + temp - 10));
            }
            else {
                result.insert(0, temp);
            }
            a /= sys;
        }
        System.out.printf(result.toString());
    }
}