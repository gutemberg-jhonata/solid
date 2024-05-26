package manager;

import email.EmailService4;
import email.EmailService4Impl;
import logger.ConsoleLogger4;
import logger.Logger3;
import repository.InMemoryUserRepository3;
import repository.UserRepository3;

public class UserManager5 implements Manager5 {

    // LSP
    private UserRepository3 userRepository = new InMemoryUserRepository3();
    private Logger3 logger = new ConsoleLogger4();
    private EmailService4 emailService = new EmailService4Impl();

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

    /*@Override
    public Double calculatePrice(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePrice'");
    }*/
    
}
