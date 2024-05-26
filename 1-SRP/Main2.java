import manager.Manager;
import manager.ProductManager2;
import manager.UserManager2;

public class Main2 {
    
    public static void main(String[] args) {
        Manager userManager = new UserManager2();
        Manager productManager = new ProductManager2();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
