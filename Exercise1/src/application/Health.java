/* Author: Nadine Castro (Student No. 301105146)
 * A child class of Insurance that sets the total health insurance cost and displays
 * insurance information for health insurance
 */
package application;

public class Health extends Insurance{

	// Declarations and Initializations
	private double _monthlyCost;
	private double _totalInsuranceCost;

	// Parameterized constructor that calls the constructor of parent abstract class
	// Initializes the basic monthly cost of health insurance
	public Health(String typeInsurance, double monthlyCost){
		super(typeInsurance);
		this._monthlyCost = monthlyCost;
	}

	// Implements the setInsuranceCost method of parent class Insurance based on its type
	@Override
	public void setInsuranceCost(){
		this._totalInsuranceCost = this._monthlyCost + 100.00;
	}

	// Implements the displayInfo method of parent class Insurance based on its type
	@Override
	public void displayInfo(){
		System.out.printf("\nInsurance Type: %s, Cost: %.2f",
				getTypeInsurance(), this._totalInsuranceCost);
	}
}
