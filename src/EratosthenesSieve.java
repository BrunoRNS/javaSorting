// This is the implementation of the sieve of eratosthenes located in:
// https://www.geeksforgeeks.org/sieve-of-eratosthenes/

import java.util.Scanner;

public class EratosthenesSieve {
    
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        
        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {

            prime[i] = true;

        }

        for (int p = 2; (int) Math.pow(p, 2) <= n; p++) {

            if (prime[p] == true) {

                for (int i = (int) Math.pow(p, 2); i <= n; i += p) {

                    prime[i] = false;

                }
            }
        }

        for (int i = 2; i <= n; i++) {

            if (prime[i] == true) {

                System.out.print(i + " ");

            }

        }
        
    }
    
}
