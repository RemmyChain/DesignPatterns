package model;

import java.util.Stack;

/**
 * Author: Remco Ketting
 * Purpose of program:
 */
public class ProductFactory {
  public static Product productFactory(String type){
    Product product;
    switch (type){
      case "Vis":
        product = new Vis();
        break;
      case "Fruit":
        product = new Fruit();
        break;
      case "KantEnKlaarMaaltijd":
        product = new KantEnKlaarMaaltijd();
        break;
      case "SpaarActies":
        product = new SpaarActies();
        break;
      default:
        product=null;;
    }
    return product;
  }
}
