public class Car {
	public String make;
  	public String model;
  	public double price;

  	public Car(String make, String model, double price){
  		this.make = make;
  		this.model = model;
  		this.price = price;
  	}

  	@Override
  	public String toString() { 
    	return "Make:  " + make + " Model: " + model + " Price: $" + price;
	}	 
}