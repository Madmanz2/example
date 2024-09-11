package projects;

import java.util.Scanner;

public class project25Momentum {

	public static void main(String[] args) {
		
		Scanner rd = new Scanner(System.in);
		
		//input data
		System.out.print("Enter objects mass: ");
		double mass = rd.nextDouble();
		
		System.out.print("Enter velocity: ");
		double vel = rd.nextDouble();
		
		//calculate
		double momentum = mass * vel;
		
		//output
		System.out.println("Momentum = " + momentum);
		
		
	}

}
