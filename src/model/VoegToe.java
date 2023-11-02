package model;

/**
 * Author: Remco Ketting
 * Purpose of program:
 */
public class VoegToe implements Actie{

    private final Product product;
    private final int amount;

    public VoegToe(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public void execute() {
        product.increaseQuantity(amount);
    }
}
