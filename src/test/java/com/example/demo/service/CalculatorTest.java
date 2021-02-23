package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp(){
        //initialser calculator
        calculator = new Calculator();
    }

    @Test
    void addTwoNumber() {
        //act
        int actResult = calculator.add(17,25);

        //assert
        assertEquals(42,actResult);
    }

    @Test
    void addTwoNumber_2() {
        //act
        int actResult = calculator.add(2,2);

        //assert
        assertEquals(4,actResult);
    }

    @Test
    void checkIfPrimeNumber(){
        //act
        boolean actResult = calculator.isPrimeNumber(5);

        //assert
        assertTrue(actResult);
    }

    @ParameterizedTest
    @ValueSource ( ints = { 2 ,3 ,3, 23 } )
    void checkPrimeFactors(int argument){
        List<Integer> primeFactors = calculator.primeFactors(414);
        ArrayList<Integer> list = new ArrayList<>();

        list.add(argument);
        list.add(argument);
        list.add(argument);
        list.add(argument);

        //assert
        assertEquals(primeFactors.get(0), argument);
    }
}