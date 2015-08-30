## Thinking About Cars...
Assume we have a car that has three properties: a make (String), model (string), and price (double).

This can be illustrated in some Java code:
```Java
String make;
String model;
double price;
```

### Now what if we wanted to have multiple cars?
Would this be the way to do it?
```Java
// Car 1
String make1;
String model1;
double price1;

// Car 2
String make2;
String model2;
double price2;
```

As you can see in order to have more than one car we would need to constantly define a lot of different variables to keep the values of these cars. One method to solve this would be to use a few arrays so we can manage all of our cars.
```Java
String[] makes = new String[2];
String[] models = new String[2];
double[] prices = new double[2];
```

As you can see it would be tedious to manage all of these different arrays.

### What about methods that do things with cars?
Let's say we wanted to print out information about cars we stored.

Assume we have access to these variables and they have been set with some values.
```Java
String make = "Honda";
String model = "Civic";
double price = 15000;
```

Now we want to call a method called printCar.
```Java
public static void printCar(string make, string model, double price) {
  System.out.println("Make:  "+make);
  System.out.println("Model: "+model);
  System.out.println("Price: $"+price);
}
```

So in order to call this method we would need to do:
```Java
printCar(make, model, price);
```

[Is there a better way?](abetterway.md)
