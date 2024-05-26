import email.EmailService5;
import email.EmailService5Impl;
import logger.ConsoleLogger5;
import logger.Logger4;
import manager.Manager6;
import manager.ProductManager6;
import manager.UserManager6;
import repository.InMemoryUserRepository4;
import repository.UserRepository4;

public class Main6 {
    
    public static void main(String[] args) {
        UserRepository4 userRepository = new InMemoryUserRepository4();
        Logger4 logger = new ConsoleLogger5();
        EmailService5 emailService = new EmailService5Impl();
        Manager6 userManager = new UserManager6(userRepository, logger, emailService);
        var productManager = new ProductManager6();
        userManager.add("Jhon");
        userManager.delete("Jhon");
        productManager.add("Ice cream!");
        productManager.delete("Ice cream!");
        System.out.println(productManager.calculatePrice("Ice cream!"));
    }

}
