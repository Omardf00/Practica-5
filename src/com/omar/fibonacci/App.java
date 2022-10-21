package com.omar.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer x = null;
		Integer a = 0;
		Integer b = 1;
		
		System.out.println("Bienvenido a la Serie de Fibonacci. Deberá introducir un número entero mayor a 1.");
		System.out.println("Introduzca el número por favor");
		
		try {
			
			x = sc.nextInt();
			
			System.out.println(a);
			
			for(Integer i=0 ; i<x ; i++) {
				System.out.println(b);
				b = a + b;
				a = b - a; 
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor, introduzca un número entero mayor a 1");
		}
		
	}

}
