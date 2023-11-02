package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Remco Ketting
 * Purpose of program: a singleton shopping cart
 */
public class ShoppingCart {
    private static ShoppingCart shoppingCart;
    private final List<Product> products;

    private ShoppingCart(){
        this.products = new ArrayList<>();
    }
    public static ShoppingCart getShoppingCart(){
        if (shoppingCart == null){
            shoppingCart = new ShoppingCart();
        }

        return shoppingCart;
    }
    public List<Product> getProducts(){
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Iterator<Product> getIterator() {
        return new ProductIterator();
    }
    private class ProductIterator implements Iterator<Product>{
        int index;
        public boolean hasNext(){
            return index < products.size();
        }
        public Product next(){
            return products.get(index++);
        }
    }


}
