package chainofResponsibility;

public class Demo {
    public static void main(String[] args) {
        SchoolHandler mathTeacher = new MathTeacher();
        SchoolHandler englishTeacher = new EnglishTeacher();
        SchoolHandler scienceTeacher = new ScienceTeacher();

        ((MathTeacher) mathTeacher).setNextHandler(englishTeacher);
        ((EnglishTeacher) englishTeacher).setNextHandler(scienceTeacher);

        mathTeacher.handleRequest("math");
        mathTeacher.handleRequest("science");
        mathTeacher.handleRequest("history");
        mathTeacher.handleRequest("english");
    }
}
