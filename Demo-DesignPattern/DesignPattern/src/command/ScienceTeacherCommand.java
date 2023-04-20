package command;

public class ScienceTeacherCommand implements SchoolCommand {
    private final ScienceTeacher scienceTeacher;

    public ScienceTeacherCommand(ScienceTeacher scienceTeacher) {
        this.scienceTeacher = scienceTeacher;
    }

    @Override
    public void execute() {
        scienceTeacher.teachScience();
    }
}
