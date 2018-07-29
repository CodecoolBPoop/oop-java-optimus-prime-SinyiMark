package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Integer> numbers = new ArrayList<>();

    Main(int n){
        if(n<1){
            System.out.println("n cannot be lower then 1");
        }
        for (int i = 1; i < n+1; i++) {
            numbers.add(i);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void countOfPrimeNumbers(){
        if (numbers.size()>0) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == 1) {

                } else {
                    Integer actualNumber = numbers.get(i);
                    for (int j = i + 1; j < numbers.size(); j++) {
                        if (numbers.get(j) % actualNumber == 0) {
                            numbers.remove(j);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Main myMain = new Main(100);
        myMain.countOfPrimeNumbers();
        System.out.println(myMain.getNumbers());
    }
}
