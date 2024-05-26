import manager.Manager2;
import manager.ProductManager2;
import manager.UserManager2;

public class Main2 {
    
    public static void main(String[] args) {
        Manager2 userManager = new UserManager2();
        Manager2 productManager = new ProductManager2();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
