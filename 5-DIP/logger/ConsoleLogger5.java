package logger;

public class ConsoleLogger5 implements Logger4 {
    
    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
