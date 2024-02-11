public class ShoppingCartSystem {
    public static void main(String[] args) {

        //Create an instance of ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();


        // Add products to the cart
        shoppingCart.addProduct(new Product("P001", "Laptop", 25.499, 5));
        shoppingCart.addProduct(new Product("P002", "Smartphone", 8.750, 10));


        // Display cart contents
        shoppingCart.displayCart();


        // Remove a product
        shoppingCart.removeProduct("P001");


        // Display updated cart contents
        shoppingCart.displayCart();


        // Calculate and display total cost
        double totalCost = shoppingCart.calculateTotalCost();
        System.out.println("Total Cost: " + totalCost + "TL");
    }
}