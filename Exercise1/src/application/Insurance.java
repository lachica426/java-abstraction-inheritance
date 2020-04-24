/* Author: Nadine Castro (Student No. 301105146)
 * An abstract superclass with abstract methods. It initializes the insurance type in
 * the constructor
 */

package application;

public abstract class Insurance {

	// field variable that stores the type of insurance
	protected String _typeInsurance;


	// parameterized constructor that initializes the _typeInsurance variable
	public Insurance(String typeInsurance){
		this._typeInsurance = typeInsurance;
	}

	// getTypeInsurance method returns the type of Insurance to the caller
	public String getTypeInsurance(){
		return _typeInsurance;
	}

	// abstract methods to be implemented by children classes
	public abstract void setInsuranceCost();
	public abstract void displayInfo();

}
