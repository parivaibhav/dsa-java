
import java.util.*;

class PrimeNumber {

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to check is prime or not:");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}
