# A Better Way
As you can see in the last section it could get really tedious with the more properties you have about a car or any other thing you were trying to describe in code. What if we had a way to this better?

Well there is a way! One quality that almost every programmer has is that we are lazy. We don't want to spend time doing something that we could make easier. So classes and objects were born!

## What is a class?
A class is a way to group together variables and methods that are related to each other. This allows programmers to create their own "types" instead of having to have multiple variables declared when really just wanting to write code about a car.

What does this look like?
```java
public class Car {
  public String make;
  public String model;
  public double price;
}
```

After creating or defining this Car class we can create _instances_ of cars that have all of these properties.

This is how you use it:
```java
Car c = new Car();
c.make = "Honda";
c.model = "Civic";
c.price = 15000;
```

That's pretty simple! Let's apply this! Make your [first class](firstclass.md)
