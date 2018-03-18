/* List all the prime factors from 1 to a specified number. 

Author: Elliot Alker

*/ 

import java.util.ArrayList;

public class PrimeFactors {

    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < n; i++) {
            System.out.println(i);
            System.out.println(primeFactor(i));
        }
    }

    public static ArrayList<Integer> primeFactor(int input) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= input; i++) {

            while (input % i == 0) {
                factors.add(i);
                input /= i;

            }

        }
        return factors;
    }

}
