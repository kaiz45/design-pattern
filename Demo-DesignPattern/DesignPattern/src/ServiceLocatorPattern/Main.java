package ServiceLocatorPattern;

public class Main {
    public static void main(String[] args) {
        String service = "enrollment";

        SchoolService schoolService = ServiceLocator.getService(service);
        schoolService.performService();
    }
}

