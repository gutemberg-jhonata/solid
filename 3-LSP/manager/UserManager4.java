package manager;

import email.EmailService3;
import email.EmailService3Impl;
import logger.ConsoleLogger3;
import logger.Logger2;
import repository.InMemoryUserRepository2;
import repository.UserRepository2;

public class UserManager4 extends Manager4 {

    // LSP
    private UserRepository2 userRepository = new InMemoryUserRepository2();
    private Logger2 logger = new ConsoleLogger3();
    private EmailService3 emailService = new EmailService3Impl();

    @Override
    public void add(String user) {
        // Add validation logic to user
        // userValidator.validate()
        userRepository.save(user);
        logger.log("User added: " + user);
        emailService.send(user);
    }

    @Override
    public void delete(String user) {
        userRepository.delete(user);
        logger.log("User deleted: " + user);
    }
    
}
