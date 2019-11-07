package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int inputValue = read.nextInt();
        int counter = 0;
        int startingValue =2;
        while ( inputValue > counter  ){
            double sqrValue = Math.sqrt(startingValue);
            int sqrValue1 = (int)sqrValue;
            boolean isPrime = checkPrimeNumber(startingValue,sqrValue1);
            if (isPrime==false){
                 counter++;
            }
            if (inputValue==counter){
                System.out.println(startingValue);
                break;
            }
            startingValue++;
        }

    }

    public static boolean checkPrimeNumber(int inputValue, int sqrValue1) {
        for (int i =2;i<=sqrValue1;i++){
            if (inputValue % i == 0){
                return true;
            }
        }
        return false;
    }
}
