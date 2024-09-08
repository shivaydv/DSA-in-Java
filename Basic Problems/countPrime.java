
import java.util.Arrays;

public class countPrime {

    public static void main(String[] args) {
        int n = 3;

        int count = 0;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
                for (int j = i * 2; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        System.out.println("Total Prime Numbers = " + count);
    }
}
