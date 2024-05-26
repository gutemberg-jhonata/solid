import manager.Manager;
import manager.ProductManager;
import manager.UserManager;

public class Main {
    
    public static void main(String[] args) {
        Manager userManager = new UserManager();
        Manager productManager = new ProductManager();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
