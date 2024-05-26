package repository;

public class DatabaseUserRepository {
    
    public void save(String user) {
        // Add user to a database
        System.out.println("Adding user: " + user);
    }

    public void delete(String user) {
        // Delete user from a database
        System.out.println("Deleting user: " + user);
    }

}
