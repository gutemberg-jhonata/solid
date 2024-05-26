package logger;

public class ConsoleLogger3 implements Logger2 {
    
    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
