package com.vehicles.project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		
		boolean isPlateOk =false;
		String plate,brand,color;
		Car car1;
		Bike bike1;
		String vehicleChoice;
		List<Wheel> frontWheels;
		List<Wheel> backWheels;
		
		//Checking plate
		do {
		System.out.println("Insert plate: ");
		plate = input.next();
		
		Pattern pat = Pattern.compile("\\d\\d\\d\\d[A-Z][A-Z][A-Z]");
		Matcher mat = pat.matcher(plate);
		isPlateOk = mat.matches();
		
		if (isPlateOk==false) {
			System.out.println("the plate is not right: ");
		}
		
		} while (isPlateOk==false);
		
		
		//asking BRAND and COLOR
		System.out.println("Insert brand: ");
		brand = input.next();
		
		System.out.println("Insert color: ");
		color = input.next();
		
		// bike or car???
		
		System.out.println("are you going to do a Car o Bike?");
		vehicleChoice = input.next().toUpperCase();
		boolean choice= false;
		
		/* using "do while" and  the "default's switch option" to 
		check the user sets a right selection CAR OR BIKE */
		
		do {
	switch (vehicleChoice){
	
	case "CAR" :
		car1 = new Car(plate,brand,color);
		frontWheels= new ArrayList<Wheel>();
		backWheels = new ArrayList<Wheel>();
		
		System.out.println(car1.toString());
		
		for (int i=0; i<Car.NUM_WHEELS; i++) {
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
		choice= true;
		break;
		
	case "BIKE" :
		
		bike1 = new Bike(plate,brand,color);
		frontWheels= new ArrayList<Wheel>();
		backWheels = new ArrayList<Wheel>();
		
		System.out.println(bike1.toString());
		
		for (int i=0; i<Bike.NUM_WHEELS; i++) {
			if (i<1) {
				bike1.wheels.add(CreatedWheel(input));
			}else {
				bike1.wheels.add(CreatedWheel(input));
			}
		}
		
		System.out.println(bike1.toString());
		choice= true;
		break;
			
	default:
		 
		System.out.println("the choice is not right, make it again (CAR OR BIKE?)");
		vehicleChoice = input.next().toUpperCase();
		break;
	}
	} while(choice==false);
		
	}
	
	public static Wheel CreatedWheel (Scanner input) {
		
		System.out.println("Insert Wheel's brand ");
		String brand = input.next();
		System.out.println("Insert Wheel's diameter ");
		double diameter = input.nextDouble();
		boolean diameterIsGood = false;
		
		//checking the wheel's diameter restriction
		
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
