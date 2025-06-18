package Day1_programmingelements;


import java.util.Scanner;
public class PoundtoKilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter weight in pounds: ");
		        double weightInPounds = scanner.nextDouble();

		        
		        double weightInKg = weightInPounds * 2.2;

		       
		        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg + ".");

		        scanner.close();
		 

	}

}