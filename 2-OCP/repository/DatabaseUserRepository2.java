package repository;

public class DatabaseUserRepository2 implements UserRepository {
    
    public void save(String user) {
        // Add user to a database
        System.out.println("Adding user to database: " + user);
    }

    public void delete(String user) {
        // Delete user from a database
        System.out.println("Deleting user from database: " + user);
    }

}
