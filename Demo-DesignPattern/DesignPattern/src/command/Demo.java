package command;

public class Demo {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        EnglishTeacher englishTeacher = new EnglishTeacher();
        ScienceTeacher scienceTeacher = new ScienceTeacher();

        SchoolCommand mathCommand = new MathTeacherCommand(mathTeacher);
        SchoolCommand englishCommand = new EnglishTeacherCommand(englishTeacher);
        SchoolCommand scienceCommand = new ScienceTeacherCommand(scienceTeacher);

        School school = new School();
        school.setMathCommand(mathCommand);
        school.setEnglishCommand(englishCommand);
        school.setScienceCommand(scienceCommand);

        school.teachMath(); // Output: Teaching math...
        school.teachEnglish(); // Output: Teaching English...
        school.teachScience(); // Output: Teaching science...
    }

}
