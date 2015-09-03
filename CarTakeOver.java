public class Car {
  public String make;
  public String model;
  public double price; // In USD

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

}
