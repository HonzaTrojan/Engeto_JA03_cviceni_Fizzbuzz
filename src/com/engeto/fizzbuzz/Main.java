package com.engeto.fizzbuzz;

public class Main {
    /** FIZZBUZZ
     * Vypisuj čísla od 1 do 100. V případě, že je dané číslo dělitelné třemi,
     * tak napiš místo něj text Fizz. Pokud je číslo dělitelné pěti, tak místo
     * čísla vypiš Buzz. A pokud je dělitelní třemi a pěti zároveň, tak vypiš FizzBuzz.
     */


    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }

    }
}