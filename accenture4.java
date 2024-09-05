import java.util.Scanner;

public class Main {

    public static int CountDigitOccurrences(int l, int u, int x) {
        int count = 0;
        for (int i = l; i <= u; i++) {
            int number = i;
            while (number != 0) {
                int digit = number % 10;
                if (digit == x) {
                    count++;
                }
                number = number / 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l:");
        int l = sc.nextInt();
        System.out.println("Enter u:");
        int u = sc.nextInt();
        System.out.println("Enter x:");
        int x = sc.nextInt();

        int res = CountDigitOccurrences(l, u, x);
        System.out.println("Result is : " + res);
    }
}
