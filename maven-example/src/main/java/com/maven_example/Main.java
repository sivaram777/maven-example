package com.maven_example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		int add=a+b; 
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println("Addition= " +add);
		System.out.println("Subtraction= " +sub);
		System.out.println("Multiplication= " +mul);
		System.out.println("Division= " +div);
		System.out.println("Division= " +div);
		System.out.println("Division= " +div);
	}

}

