package chainofResponsibility;

public class EnglishTeacher implements SchoolHandler {
    private SchoolHandler nextHandler;

    public void setNextHandler(SchoolHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String request) {
        if(request.equals("english")) {
            System.out.println("English teacher can handle " + request + " request.");
        } else {
            System.out.println("English teacher cannot handle " + request + " request.");
            if(nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}

