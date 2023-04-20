package FrontControllerPattern;

public class Main {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("TEACHER");
        frontController.dispatchRequest("STUDENT");
    }
}
