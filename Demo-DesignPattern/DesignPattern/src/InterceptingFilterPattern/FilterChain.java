package InterceptingFilterPattern;

import java.util.*;

public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private SchoolManager schoolManager;

    public FilterChain(SchoolManager schoolManager) {
        this.schoolManager = schoolManager;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        schoolManager.handleRequest(request);
    }
}

