package manager;

public abstract class Manager4 {
    public void add(String value) {
        System.out.println("Abstract add");
    };

    public void delete(String value) {
        System.out.println("Abstract delete");
    }

    public Double calculatePrice(String value) {
        System.out.println("Calculating...");
        return 20.0;
    };
}
