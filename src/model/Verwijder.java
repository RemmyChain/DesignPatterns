package model;

/**
 * Author: Remco Ketting
 * Purpose of program:
 */
public class Verwijder implements Actie{
    private final Product product;
    private final int amount;

    public Verwijder(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public void execute() {
        product.decreaseQuantity(amount);

    }
}
