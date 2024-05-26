package logger;

public class ConsoleLogger2 implements Logger {
    
    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
