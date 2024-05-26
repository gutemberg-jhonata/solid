package manager;

import email.EmailService2;
import email.EmailService2Impl;
import logger.ConsoleLogger2;
import logger.Logger;
import repository.InMemoryUserRepository;
import repository.UserRepository;

public class UserManager3 implements Manager3 {

    private UserRepository userRepository = new InMemoryUserRepository();
    private Logger logger = new ConsoleLogger2();
    private EmailService2 emailService = new EmailService2Impl();

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

    @Override
    public Double calculatePrice(String value) {
        return null;
    }
}
