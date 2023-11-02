package model;

/**
 * Author: Remco Ketting
 * Purpose of program: a fictional product for design pattern practice
 */
public class Product {
  private int serialNumber;
  private String productDescription;
  private int quantity;
  private double price;
  private String brand;

  public Product withSerial(int serial){
    this.serialNumber = serial;
    return this;
  }
  public Product withProductDescription(String productDescription){
    this.productDescription = productDescription;
    return this;
  }
  public Product withQuantity(int quantity){
    this.quantity = quantity;
    return this;
  }
  public Product withPrice(double price){
    this.price = price;
    return this;
  }
  public Product withBrand(String brand){
    this.brand = brand;
    return this;
  }

  @Override
  public String toString() {
    return
            "serialNumber=" + serialNumber +
            ", productDescription='" + productDescription + '\'' +
            ", quantity=" + quantity +
            ", price=" + price +
            ", brand='" + brand + '\''
            ;
  }
  public String printType(){
    return null;
  }
}
