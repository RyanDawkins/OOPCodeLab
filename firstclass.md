# First class

Open Car.java and you will see a class definition with one method. Don't worry about that for now, we just need to add the properties of the class. For now a car will have a make, model, and a price. Think about what types these properties should be. For the price, we care about including correct change.

`hint: your properties need to match the variable names in the toString method.`

--------------------------------------------------------------------------------

## Properties

We need to add some properties to this class. Let's look at what we have so far.

````java
public class Car {
	
  	@Override
  	public String toString() { 
    	return "Make:  " + make + " Model: " + model + " Price: $" + price;
	}	 
}
````

Looks like we need to add properties called `make`, `model`, and `price`. We can do that like this:

````java
public class Car {
	public String make;
  	public String model;
  	public double price;

  	@Override
  	public String toString() { 
    	return "Make:  " + make + " Model: " + model + " Price: $" + price;
	}	 
}
````

## Constructor

Now we have the properties to hold our data, but we don't have a way to set those when making a new object. If we instantiate the class without a constructor, the strings will start out as null, and the decimal will recieve a default value of 0.0. What if we want to have different defualt values, or set all of the properties at the time of creation?

For that we write a contructor. Here's my example:

````java
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
````

This might be a little confusing, so lets walk through it step by step.

````java
public Car(String make, String model, double price){
	...
}
````

Our method signature has the same name as our class. This tells the compiler that we want to make a new instance of the class, or an object of type Car. The parameters we send in will be availible in the scope of this method, and these will be used to set the values of the object.

````java
public Car(String make, String model, double price){
	this.make = make;
	this.model = model;
	this.price = price;
}
````

The method body requires some more knowledge about objects in Java. Here we use the `this` keyword to differentiate the `make` that belongs to the object being created and the `make` parameter that we pass into the constructor. `this` is simply a refence that an object has to itself. We'll go over refences in more detail soon, but right now just think of it as a way to explicitly access variables and methods in an object.

Here are the [Oracle Docs](http://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html) on the `this` keyword for more clarification.

--------------------------------------------------------------------------------

## Using the Class

If you had trouble following the example, you can use [CarSolution.java](CarSolution.java). To use it with the CarDemo class, it needs to be renamed to `Car.java`. Feel free to use the solution, but please make sure that you understand all of the steps of the tutorial.

Follow along with the next step in [usingobjects.md](usingobjects.md).