package com.vehicles.project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


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
		
		List<Wheel> frontWheels = new ArrayList<>();
		
		for (int i=0; i<2;i++) {
			
			System.out.println("Insert "+ i +" brand wheel:");
			String wheelBrand = input.next();
			
			System.out.println("Insert "+ i+ " diametre wheel:");
			double wheelDiametre = input.nextDouble();
			
			Wheel createdWheel = new Wheel(wheelBrand,wheelDiametre);
			
		}
		
		
		
		
		

	}

}
