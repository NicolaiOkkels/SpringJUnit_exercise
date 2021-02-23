package com.example.demo;

import com.example.demo.service.Calculator;

import java.util.List;
import java.util.Scanner;

public class Lommeregner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       // System.out.println(calculator.add(17, 25)); // 42
        //System.out.println(calculator.add(2,2)); // 4
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter number: ");
        // int number = input.nextInt();
        //System.out.println("Er det prime nummber: "+ calculator.isPrimeNumber(number));

        List<Integer> primeFactors = calculator.primeFactors(117);

        for (int primeFactor:primeFactors) {
            System.out.println(primeFactor);
        }

    }
}
