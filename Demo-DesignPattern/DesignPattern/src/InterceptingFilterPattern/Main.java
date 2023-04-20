package InterceptingFilterPattern;

public class Main {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.processRequest("GET /school/1");
        schoolManager.processRequest("POST /course");
        schoolManager.processRequest("DELETE /student/2");
    }

}
