package com.lfa.day1;
import java.util.Scanner;


public class SimpleInterest{

public static void main(String[] args){
    int interest;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the principal");
    int principal = input.nextInt();
    System.out.println("Enter the rate");
    int rate = input.nextInt();
    System.out.println("Enter the time");
    int time = input.nextInt();
    interest = (principal*rate*time)/100;
    System.out.println("The simple interest is" +interest);
    //System.out.printf("The simple interest is %d",interest);
     

}
}