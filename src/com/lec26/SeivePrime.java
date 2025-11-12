package com.lec26;

public class SeivePrime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        //All the elements will be false
        sieve(n, primes);
    }

    // false in array means number is prime
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) { //if (! false) means - if true
                // if (prime[i] == false)
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++){
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
