import manager.ProductManager4;
import manager.UserManager4;

public class Main4 {
    
    public static void main(String[] args) {
        var userManager = new UserManager4();
        var productManager = new ProductManager4();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
