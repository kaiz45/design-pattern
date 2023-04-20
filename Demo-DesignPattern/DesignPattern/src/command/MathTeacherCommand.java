package command;

public class MathTeacherCommand implements SchoolCommand {
    private final MathTeacher mathTeacher;

    public MathTeacherCommand(MathTeacher mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    @Override
    public void execute() {
        mathTeacher.teachMath();
    }
}
