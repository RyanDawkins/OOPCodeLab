# Using Objects

We will provide a sample class to use the car that we just made together, but we will walk through what it's doing together. The file can be found at [CarDemo.java](CarDemo.java).

We're going to show the difference between using object and primative in Java. In Java there are 8 primative types `boolean`, `byte`, `char`, `double`, `int`, `float`, `long` and `short`. When we assign these to new varaibles, they are passed by value. That means that the value of the variable is coppied to a new variable. We can see this clearly with the following example:

````java
// pass by value illustraction
int a = 1;
int b = 2;

System.out.println("b = " + b + ", a = " + a);

b = a; // set b to the value of a

System.out.println("b = " + b + ", a = " + a);

a += 1; // incriments a by one

// what will print for b?
System.out.println("b = " + b + ", a = " + a);
````

In this example, when we update the value of `a` after it is assigned to be, the changes are not coppied over to `b`. The relationship between these variables ends at the time of assignment. The value of a is coppied into be, and the variables are completely independant of each other for the duration of the program.

This is not the case when using object instances. In the example we make two instances of the `Car` class, one called `x` and one called `y`. What happens when we assign `x` the value of `y`?

From the above example we would expect the values of `y` to be coppied into `x`. 

````java
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
````

The last print statement actually prints `Make:  Bugatti Model: Veyron Price: $0.0`. If objects were passed by value, we would expect it to print `Make:  Make Model: Model Price: $0.0`. So why the difference? In Java, objects are passed by reference. This mean that `x` now refers to `y`. So when changes are made to `y`, they are reflected in `x` because it simple points to the values of `y`.