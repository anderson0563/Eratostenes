package br.anderson.eratostenes;
import java.util.ArrayList;
import java.util.List;

public class CalculoEratostenes {

    public List<Integer> findPrimes(int limit) {
        boolean[] isComposite = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                primes.add(i);

                for (int j = i * i; j <= limit; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return primes;
    }
}