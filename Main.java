package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int answer = user.nextInt();
	int endAnswer = ((answer+5)*2)-7;
	System.out.println("The answer is: "+endAnswer);
    }
}
