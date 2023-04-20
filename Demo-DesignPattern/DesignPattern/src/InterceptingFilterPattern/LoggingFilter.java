package InterceptingFilterPattern;

public class LoggingFilter implements Filter {
    public void execute(String request) {
        System.out.println("Logging request: " + request);
    }
}
