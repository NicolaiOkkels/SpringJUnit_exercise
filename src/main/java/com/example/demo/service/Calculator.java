package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //add 2 numbers
    public int add(int x, int y) {
        return x + y;
    }

    public boolean isPrimeNumber(int number) {
        boolean isItPrime = false;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number > i) {
                return isItPrime;
            } else if (i == number) {
                isItPrime = true;
                return isItPrime;
            }
        }
        return isItPrime;
    }

    public List<Integer> primeFactors(int number){
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            while(number%i == 0){
                primeFactors.add(i);
                number = number/i;
            }
        }
        if(number>2){
            primeFactors.add(number);
        }

        return primeFactors;
    }
}
