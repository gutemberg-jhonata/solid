package manager;

import email.EmailService;
import logger.ConsoleLogger;
import repository.DatabaseUserRepository;

public class UserManager2 implements Manager2 {

    private DatabaseUserRepository userRepository = new DatabaseUserRepository();
    private ConsoleLogger logger = new ConsoleLogger();
    private EmailService emailService = new EmailService();

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

    @Override
    public Double calculatePrice(String value) {
        return null;
    }
}
