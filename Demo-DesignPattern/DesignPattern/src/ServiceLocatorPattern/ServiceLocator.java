package ServiceLocatorPattern;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static Map<String, SchoolService> services = new HashMap<>();

    static {
        services.put("enrollment", new EnrollmentService());
        services.put("schedule", new ScheduleService());
    }

    public static SchoolService getService(String serviceName) {
        return services.get(serviceName);
    }
}

