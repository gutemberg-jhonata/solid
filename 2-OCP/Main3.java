import manager.Manager3;
import manager.ProductManager3;
import manager.UserManager3;

public class Main3 {
    
    public static void main(String[] args) {
        Manager3 userManager = new UserManager3();
        Manager3 productManager = new ProductManager3();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
