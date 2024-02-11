public class Product {

    String productId;
    String productName;
    double price;
    int quantityInCart;

    // Getter and Setter
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInCart() {
        return quantityInCart;
    }

    public void setQuantityInCart(int quantityInCart) {
        this.quantityInCart = quantityInCart;
    }

    // Constructor
    public Product(String productId, String productName, double price, int quantityInCart) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInCart = quantityInCart;
    }





}
