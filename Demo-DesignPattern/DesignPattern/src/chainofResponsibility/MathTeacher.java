package chainofResponsibility;

public class MathTeacher implements SchoolHandler {
    private SchoolHandler nextHandler;

    public void setNextHandler(SchoolHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String request) {
        if(request.equals("math")) {
            System.out.println("Math teacher can handle " + request + " request.");
        } else {
            System.out.println("Math teacher cannot handle " + request + " request.");
            if(nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
