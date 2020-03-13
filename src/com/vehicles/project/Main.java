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
		
		Car car1;
		List<Wheel> frontWheels;
		List<Wheel> backWheels;
		
		
		car1 = new Car(plate,brand,color);
		
		frontWheels= new ArrayList<Wheel>();
		backWheels = new ArrayList<Wheel>();
		
		for (int i=0; i<4; i++) {
			if (i<2) {
				frontWheels.add(CreatedWheel(input));
			}else {
				backWheels.add(CreatedWheel(input));
			}
		}
		
		try {
			car1.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(car1.toString());
		
	
		
	}
	
	public static Wheel CreatedWheel (Scanner input) {
		
		System.out.println("Insert Wheel's brand ");
		String brand = input.next();
		System.out.println("Insert Wheel's diameter ");
		double diameter = input.nextDouble();
		boolean diameterIsGood = false;
		while (diameterIsGood == false) {
			if (diameter>0.4 && diameter<4) {
			diameterIsGood = true;
			}else {
			System.out.println("Insert other wheel's Diametre (between 0,4 and 4):");
			diameter = input.nextDouble();
			}
		}
		
		Wheel wheel = new Wheel(brand,diameter);
		return wheel;
	}
	

		
		
	
	
	
	

}
