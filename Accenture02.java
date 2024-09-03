import java.util.*;

public class MyClass {

    static int balancefruits(int a, int m, int rs) {
        if (m == a) {
            return rs;
        }
        if (a > m) {
            a = a - m;
            rs = rs - a;
        } else if (a < m) {
            m = m - a;
            rs = rs - m;
        }
        return rs; // Ensure we return the result calculated
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyClass obj = new MyClass();

        System.out.println("Enter number of Mangoes");
        int m = sc.nextInt();

        System.out.println("Enter number of Apples");
        int a = sc.nextInt();

        System.out.println("Enter Rupees");
        int rs = sc.nextInt();

        int res = obj.balancefruits(a, m, rs); // Note: The order of parameters corrected to (a, m, rs)
        System.out.println("Rupees left = " + res);
    }
}
