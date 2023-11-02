package controller;

import model.*;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Remco Ketting
 * Purpose of program: testing product code and stuff
 */
public class WebAppLauncher {
    public static void main(String[] args) {



        Product appel  = new Product().withSerial(1233).withBrand("Elstar").
                withPrice(1.23).withQuantity(355).withProductDescription("big red juicy apples");

        Product lasagna = new Product().withSerial(123).withProductDescription("Lasagna bologna");

        Product zalm = new Product().withPrice(55).withProductDescription("vissig");

        ShoppingCart cart1 = ShoppingCart.getShoppingCart();
        ShoppingCart cart2 = ShoppingCart.getShoppingCart();
        ShoppingCart cart3 = ShoppingCart.getShoppingCart();

        cart1.addProduct(appel);
        cart2.addProduct(lasagna);
        cart3.addProduct(zalm);


        System.out.println(printList(cart1.getProducts()));

        Product product1 = ProductFactory.productFactory("Fruit").withProductDescription("Rode Appel");
        Product product2 = ProductFactory.productFactory("Vis").withPrice(22).withBrand("bij de leidl gekocht") ;
        Product product3 = ProductFactory.productFactory("KantEnKlaarMaaltijd").withProductDescription("lasagna");
        Product product4 = ProductFactory.productFactory("SpaarActies").withProductDescription("pannenset");

        System.out.printf("%s%s\n", product1, product1.printType());
        System.out.println(product2.printType());
        System.out.println(product3.printType());
        System.out.println(product4.printType());

        maakAanEnVoegToe();



        for (Iterator<Product> iterding = cart1.getIterator(); iterding.hasNext();) {
            Product x = iterding.next();
            cart1.voegActieToe(new VoegToe(x, 5));
        }
        cart1.voerActiesUit();
        for (Iterator<Product> iterding = cart1.getIterator(); iterding.hasNext();) {
            Product x = iterding.next();
            System.out.println(x);

        }


    }
    public static String printList(List<Product> products){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            stringBuilder.append(products.get(i));
            stringBuilder.append(products.get(i).printType());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public static void maakAanEnVoegToe(){
        Scanner toetsenbord = new Scanner(System.in);
        ShoppingCart cart1 = ShoppingCart.getShoppingCart();
        for (int i = 0; i < 4; i++) {
            System.out.println("Wat voor soort product wilt u toevoegen?");
            Product product1 = ProductFactory.productFactory(toetsenbord.next());
            cart1.addProduct(product1);

        }

    }

}
