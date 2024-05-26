package repository;

public class InMemoryUserRepository implements UserRepository {

    public void save(String user) {
        // Add user to a database
        System.out.println("Adding user to memory: " + user);
    }

    public void delete(String user) {
        // Delete user from a database
        System.out.println("Deleting user from memory: " + user);
    }
    
}
