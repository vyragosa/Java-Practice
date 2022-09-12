import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int sys = scanner.nextInt();
        double a = scanner.nextDouble();
        int an = (int) a;

        while(an > 0) {
            int temp = an % sys;
            if (temp >= 10) {
                result.insert(0, (char) ('A' + temp - 10));
            }
            else {
                result.insert(0, temp);
            }
            an /= sys;
        }
        result.append(".");
        double fr_p = a - (int) a;
        int k = 0;
        while(k != 3) {
            int temp = (int) (fr_p * sys);
            if (temp >= 10) {
                result.append((char) ('A' + temp - 10));
            }
            else {
                result.append(temp);
            }
            fr_p = fr_p * sys - temp;
            k++;
        }
        System.out.printf(result.toString());
    }
}