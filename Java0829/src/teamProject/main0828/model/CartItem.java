package teamProject.main0828.model;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void changeQuantity(int amount) {
        quantity = amount;
    }

    public void decreaseProductStock() {
        product.decreaseStock(quantity);
    }
}