package chainofResponsibility;

public class ScienceTeacher implements SchoolHandler {
    private SchoolHandler nextHandler;

    public void setNextHandler(SchoolHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String request) {
        if(request.equals("science")) {
            System.out.println("Science teacher can handle " + request + " request.");
        } else {
            System.out.println("Science teacher cannot handle " + request + " request.");
            if(nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}