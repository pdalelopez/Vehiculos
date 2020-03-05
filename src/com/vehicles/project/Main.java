package com.vehicles.project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insert plate: ");
		String plate = input.next();
		System.out.println("Insert brand: ");
		String brand = input.next();
		System.out.println("Insert color: ");
		String color = input.next();
		
		Car car1 = new Car(plate,brand,color);
		
		List<Wheel> frontWheels = new ArrayList<>();
		List<Wheel> backWheels = new ArrayList<>();
		
		
			
			System.out.println("Insert frist brand wheel:");
			String wheelBrand = input.next();
			
			System.out.println("Insert frist diametre wheel:");
			double wheelDiametre = input.nextDouble();
			
			Wheel Wheel1 = new Wheel(wheelBrand,wheelDiametre);
			
			System.out.println("Insert second brand wheel:");
			wheelBrand = input.next();
			
			System.out.println("Insert second diametre wheel:");
			wheelDiametre = input.nextDouble();
			
			Wheel Wheel2 = new Wheel(wheelBrand,wheelDiametre);
			
			frontWheels.add(Wheel1);
			frontWheels.add(Wheel1);
			backWheels.add(Wheel2);
			backWheels.add(Wheel2);
			
			car1.addWheels(frontWheels, backWheels);
		
		
		
		
		
		

	}

}
