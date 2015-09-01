public class CarDemo {
	public static void main(String[] args){
		// pass by value illustraction
		int a = 1;
		int b = 2;

		System.out.println("b = " + b + ", a = " + a);

		b = a; // set b to the value of a

		System.out.println("b = " + b + ", a = " + a);

		a += 1; // incriments a by one

		// what will print for b?
		System.out.println("b = " + b + ", a = " + a);

		// pass by reference illustration
		Car x = new Car("Ford", "Taurus", 2000.00);
		Car y = new Car("Make", "Model", 0.00);

		System.out.println(x);

		x = y; // set x to a reference of y

		System.out.println(x); // now prints all of the properties on y

		// changing the values of y, but we just care about the values of x
		y.make = "Bugatti";
		y.model = "Veyron";

		// what do we expect to print?
		System.out.println(x);
	}    
}
