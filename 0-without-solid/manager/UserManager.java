package manager;

public class UserManager implements Manager {

    @Override
    public void add(String user) {
        // Add user to a database
        System.out.println("Adding user: " + user);
        // Logging
        System.out.println("User added: " + user);
        // Sending an email to the user
        System.out.println("Sending email to: " + user);
    }

    @Override
    public void delete(String user) {
        // Delete user from a database
        System.out.println("Deleting user: " + user);
        // Logging
        System.out.println("User deleted: " + user);
    }

    @Override
    public Double calculatePrice(String value) {
        return null;
    }
}
