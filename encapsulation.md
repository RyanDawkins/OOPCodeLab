# Encapsulation

When thinking about creating your classes one thing you should think about is what methods do I want people, or myself to be able to access when using my object? Are there any values I don't want anyone to change once it has been set or are there any values that I don't want to be directly modified.

These questions are what created what is called "access modifiers". These are keywords that prevent outside access to a value or function within your class.

The keywords to remember are: public, private, and protected. For today we are only going to focus on public and private.

## In action
A public access modifier allows anyone outside of the class to modify the value or to call a function.

For example in one of our previous pages we had something like this:
```java
public class Car {
  public String make;
  public String model;
  public double price;
}
```

Now that's fine and dandy. Let's add a method called getUSDPrice() and setUSDPrice().

```java
public class Car {
  public String make;
  public String model;
  public double price;

  public void setUSDPrice(double price) {
    this.price = price;
  }

  public double getUSDPrice() {
    return this.price;
  }
}
```

This implies that we are storing our price value as USD. Let's assume the USD price and the EU price are the same based off of the exchange rate. (I could exchange USD for EU dollars and I would be able to pay with the same amount I had.)

Now what if we wanted to have a method called getEUPrie() and setEUPrice(). We don't want to have seperate values for EU price and USD price, but we want to be able to get the different prices on the fly.

So what if when we set the Euro price we converted it to USD behind the scenes, and when something asked for the Euro price we would convert the USD price to Euros.

```java
public class Car {
  public String make;
  public String model;
  public double price; // In USD

  // 1 Euro = 1.11 USD
  public static final int EURO_TO_USD_CONVERSION_RATE = 1.11;

  public void setUSDPrice(double price) {
    this.price = price;
  }

  public double getUSDPrice() {
    return this.price;
  }

  public double getEUPrice() {
    return this.price / EURO_TO_USD_CONVERSION_RATE;
  }

  public void setEUPrice(double price) {
    this.price = price * EURO_TO_USD_CONVERSION_RATE;
  }

}
```

This is great! Now we can set/get in USD and also EU dollars!


## The Problem with it being public..
Now let's assume it's 2100 and the Illuminati have taken over! Well now there is the KWD (Kayne West Dollar) and it is the global currency! However everyone hasn't switched over yet so we HAVE to keep supporting Euros and USD. AND Kayne "The Great" West has mandated all programs store their prices in KWD! What do we do?

And an even bigger problem!!!!! Programmers have found out that they don't have to type out getUSDPrice and have been just using the price value! Sit down, remain calm. This couldn't happen. But it might... so that's why we also have the private keyword to prevent this catastrophe from happening.

First let's open CarTakeOver.java

First thing we need to do is prevent other programmers from directly accessing and modifying price! So let's change ```public double price``` to ```private double price```. This will prevent anyone outside of the class from using price, but will allow our class to use it still! It's also best practice to do this to the remaining variables in case something like this happens. So let's do that also, but don't focus on them.

```java
public class Car {
  private String make;
  private String model;
  private double price; // In USD

  // 1 KDW = 10 USD
  public static final double KWD_TO_USD = 0.1;
  // 1 KDW = 11.1 Euros
  public static final double KWD_TO_EURO = 0.11;

  // 1 Euro = 1.11 USD
  public static final double EURO_TO_USD_CONVERSION_RATE = 1.11;

  public void setUSDPrice(double price) {
    this.price = price;
  }

  public double getUSDPrice() {
    return this.price;
  }

  public double getEUPrice() {
    return this.price / EURO_TO_USD_CONVERSION_RATE;
  }

  public void setEUPrice(double price) {
    this.price = price * EURO_TO_USD_CONVERSION_RATE;
  }

  /** Ignore this code it's here for completeness **/
  public void setMake(String make) { this.make = make; }
  public String getMake() { return this.make; }

  /** Ignore this code it's here for completeness **/
  public void setModel(String model) { this.model = model; }
  public String getModel() { return this.model; }

}
```

Now we need to internally change our price to be stored in KWD!

```java
public class Car {
  private String make;
  private String model;
  private double price; // In USD

  // 1 KDW = 10 USD
  public static final double KWD_TO_USD = 0.1;
  // 1 KDW = 11.1 Euros
  public static final double KWD_TO_EURO = 0.11;

  // 1 Euro = 1.11 USD
  public static final double EURO_TO_USD_CONVERSION_RATE = 1.11;

  public void setUSDPrice(double price) {
    this.price = price * KWD_TO_USD;
  }

  public double getUSDPrice() {
    return this.price / KWD_TO_USD;
  }

  public double getEUPrice() {
    return this.price / KWD_TO_EURO;
  }

  public void setEUPrice(double price) {
    this.price = price * KWD_TO_EURO;
  }

  /** Ignore this code it's here for completeness **/
  public void setMake(String make) { this.make = make; }
  public String getMake() { return this.make; }

  /** Ignore this code it's here for completeness **/
  public void setModel(String model) { this.model = model; }
  public String getModel() { return this.model; }
}
```

Now let's add in two remaining methods to get/set in KWD!

```java
public class Car {
  private String make;
  private String model;
  private double price; // In USD

  // 1 KDW = 10 USD
  public static final double KWD_TO_USD = 0.1;
  // 1 KDW = 11.1 Euros
  public static final double KWD_TO_EURO = 0.11;

  // 1 Euro = 1.11 USD
  public static final double EURO_TO_USD_CONVERSION_RATE = 1.11;

  public void setUSDPrice(double price) {
    this.price = price * KWD_TO_USD;
  }

  public double getUSDPrice() {
    return this.price / KWD_TO_USD;
  }

  public double getEUPrice() {
    return this.price / KWD_TO_EURO;
  }

  public void setEUPrice(double price) {
    this.price = price * KWD_TO_EURO;
  }

  public double getKWDPrice() {
    return this.price;
  }

  public void setKWDPrice(double price) {
    this.price = price;
  }

  /** Ignore this code it's here for completeness **/
  public void setMake(String make) { this.make = make; }
  public String getMake() { return this.make; }

  /** Ignore this code it's here for completeness **/
  public void setModel(String model) { this.model = model; }
  public String getModel() { return this.model; }

}
```

If you went through all of this and just wanted something more you can move forward with [Concerning Hobbits](hobbits.md)
