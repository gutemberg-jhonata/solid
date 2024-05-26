package logger;

public class ConsoleLogger4 implements Logger3 {
    
    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
