package edu.miguel.thirdweek;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int num = 5, 
        count = 1; 
        do { 
            num += count; 
            System.out.println(num); 
        } while (count <= 3);
        
    }
}
