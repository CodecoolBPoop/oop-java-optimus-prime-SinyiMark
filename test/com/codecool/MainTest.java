package com.codecool;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testTheListOfNumbers(){
        Main myMain = new Main(10);
        assertNotNull(myMain.getNumbers());
        if (!myMain.getNumbers().equals(Arrays.asList(1,2,3,4,5,6,7,8,9,10))){
            System.out.println("List of numbers is not as expected");
        }else {
            System.out.println("List of numbers is good");
        }

    }

    @Test
    void countOfPrimeNumbers() {
        Main myMain = new Main(10);
        myMain.countOfPrimeNumbers();
        if (!myMain.getNumbers().equals(Arrays.asList(1,2,3,5,7))){
            System.out.println("List of prime numbers is not as expected");
        }else {
            System.out.println("List of prime numbers is good");
        }
    }

}