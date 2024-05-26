package manager;

import email.EmailService5;
import logger.Logger4;
import repository.UserRepository4;

public class UserManager6 implements Manager6 {

    private UserRepository4 userRepository;
    private Logger4 logger;
    private EmailService5 emailService;
    
    public UserManager6(
        UserRepository4 userRepository, 
        Logger4 logger, 
        EmailService5 emailService) {
            this.userRepository = userRepository;
            this.logger = logger;
            this.emailService = emailService;
    }

    @Override
    public void add(String user) {
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
