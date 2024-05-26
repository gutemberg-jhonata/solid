import manager.Manager5;
import manager.ProductManager5;
import manager.UserManager5;

public class Main5 {
    
    public static void main(String[] args) {
        Manager5 userManager = new UserManager5();
        var productManager = new ProductManager5();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
