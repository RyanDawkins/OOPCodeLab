# Concerning Hobbits

Here I'm just going to give you little tasks and it's your job to do it! I'll give you a small code snippet to start and then after that it's all you!

```java

public class Hobbit {

  public static final int DEFAULT_HEALTH = 100;

  // Create some class variables here (remember we don't want other code to directly access them)
  // Variables to create: name, age, health
  // Refer to [Encapsulation](encapsulation.md) if you need help.

  /*
   * Member variables below
   */

  public Hobbit(String name, int age) {
    // Set the parameter values of name and age to their member variables and set health to the default health constant
  }

  // Create "getters" and "setters" for the name, age, and health.
  // Refer to [Encapsulation](encapsulation.md) if you need help.

  /*
   * Getters/setters below
   */

  public boolean attack(Hobbit hobbit) {

    // Fill here the subtracts 10 health from the hobbit you received as a parameter.

  }

  @Override
  public String toString() {
    // Make a method here that returns "Hello my name is __, I'm ___ years old and I have ___ health left."
  }

}

```

Here's the main class you can run to see if it works..
```java

public class Main {

  public static void main(String[] args) {

    Hobbit h1 = new Hobbit("Bilbo", 111);
    Hobbit h2 = new Hobbit("Frodo", 33);
    Hobbit h3 = new Hobbit("Grumpy Hobbit", 65);

    System.out.println(h1);
    System.out.println(h2);
    System.out.println(h3);

    h1.attack(h3);
    h3.attack(h1);

    System.out.println(h1);
    System.out.println(h2);
    System.out.println(h3);

  }

}

```
