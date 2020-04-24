/* Author: Nadine Castro (Student No. 301105146)
 * Tester class that prompts the user to enter insurance type and its cost.
 * It creates an object of Life and Health insurance classes; It also places an Insurance reference
 * to each new object into an array and calls the setInsuranceCost and displayInfo methods through
 * each iteration
 */
package application;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		// Declaration and Initialization
		String typeInsurance;
		double monthlyCost;
		int couLife=0;
		int couHealth=0;
		Scanner input = new Scanner(System.in);
		Insurance[] insuranceList = new Insurance[2];

		// Loops twice to ask input from user for the type and cost of insurance
		for(int i=0; i<2; i++ ){

			//Prompts the user to enter the insurance type and its cost
			System.out.print("Enter the insurance type: ");
			typeInsurance = input.nextLine();
			System.out.print("Enter the monthly cost: ");
			monthlyCost = input.nextDouble();


			// checks the type of insurance and create the appropriate object.
			// It also places an Insurance reference to each new object through an array
			if (typeInsurance.equalsIgnoreCase("Health")){
				if(couLife==0){
					Health myHealth = new Health(typeInsurance, monthlyCost);
					insuranceList[i] = myHealth;
				}else{
					Health myHealth2 = new Health(typeInsurance, monthlyCost);
					insuranceList[i] = myHealth2;
				}
				couLife++;
			}else if (typeInsurance.equalsIgnoreCase("Life")){
				if(couHealth==0){
					Life myLife = new Life(typeInsurance, monthlyCost);
					insuranceList[i] = myLife;
				}else{
					Life myLife2 = new Life(typeInsurance, monthlyCost);
					insuranceList[i] = myLife2;
				}
			}

			input.nextLine();
		}

		// Repeat for each object of the array
		for (Insurance insuranceObj : insuranceList) {
			insuranceObj.setInsuranceCost();
			insuranceObj.displayInfo();
		}

		input.close();
	}

}
