package InterceptingFilterPattern;

public class SchoolManager {
    private FilterChain filterChain;

    public SchoolManager() {
        filterChain = new FilterChain(this);
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthorizationFilter());
        filterChain.addFilter(new LoggingFilter());
    }

    public void handleRequest(String request) {
        System.out.println("Handling request: " + request);
    }

    public void processRequest(String request) {
        filterChain.execute(request);
    }
}

