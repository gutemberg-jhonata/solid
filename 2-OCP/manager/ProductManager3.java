package manager;

public class ProductManager3 implements Manager3 {

    @Override
    public void add(String product) {
        // Add user to a database
        System.out.println("Adding product: " + product);
        // Logging
        System.out.println("Product added: " + product);
    }

    @Override
    public void delete(String product) {
        // Delete user from a database
        System.out.println("Deleting product: " + product);
        // Logging
        System.out.println("Product deleted: " + product);
    }

    @Override
    public Double calculatePrice(String product) {
        // Calculate price
        System.out.println("Calculating price...");
        return 10.5;
    }
    
}
