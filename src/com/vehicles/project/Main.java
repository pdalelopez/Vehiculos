package com.vehicles.project;

import java.util.Scanner;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insert plate: ");
		String plate = input.next();
		System.out.println("Insert brand: ");
		String brand = input.next();
		System.out.println("Insert color: ");
		String color = input.next();
		
		
		Car car1 = new Car(plate,brand,color);
		

	}

}
