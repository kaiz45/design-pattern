package InterceptingFilterPattern;

public class AuthorizationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authorizing request: " + request);
    }
}
