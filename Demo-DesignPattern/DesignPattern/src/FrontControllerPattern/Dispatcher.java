package FrontControllerPattern;

public class Dispatcher {
    private StudentView studentView;
    private TeacherView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new TeacherView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }
        else{
            homeView.show();
        }
    }
}