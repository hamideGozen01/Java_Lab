import java.util.ArrayList;

class ShoppingCart {
    //Create a ShoppingCart class that contains an ArrayList of Product objects.
    private ArrayList<Product> cart;

    //) ShopingCart(): Constructor to create an ArrayList from Product class.
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    //addProduct(Product product): Add a new product in the cart.
    public void addProduct(Product product) {
        cart.add(product);
    }


    //) removeProduct(String productID): Search and Remove the product in the cart:
    public void removeProduct(String productId) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).productId.equals(productId)) {
            //write your code to remove product
                cart.remove(i);

            System.out.println(productId + " of product removed from the cart");
        }
            else{
            System.out.println(productId + " of product not found in the cart.");
        }
    }

}

    //displayCart(): Display information of the cart content as sample output.
    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : cart) {
            System.out.println("---------------");
            System.out.println("\tProduct ID: " + product.getProductId());
            System.out.println("\tProduct Name: " + product.getProductName());
            System.out.println("\tPrice: " + product.getPrice() + "TL");
            System.out.println("\tQuantity in Cart: " + product.getQuantityInCart());
            System.out.println("---------------");
        }
    }

    //calculateTotalCost(): Calculate the total cost in the cart.
    public double calculateTotalCost() {
        double totalCost = 0;
        //write your codes
        for (Product product:cart
             ) { totalCost += product.getPrice() * product.getQuantityInCart();

        }
        return totalCost;
    }
}

