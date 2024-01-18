package com.summerpeace.helloworld;
import java.util.Scanner;
public class Helloworld {
    public static void main(String[] args){
   int num;
         String message;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Number:");
         num = input.nextInt();
         if (num % 2 ==0){
             message = "is even";
         }else{
             message = "is odd";
         }
        System.out.println(message);
    }
}
