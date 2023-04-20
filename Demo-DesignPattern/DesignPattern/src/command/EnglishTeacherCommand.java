package command;

public class EnglishTeacherCommand implements SchoolCommand {
    private final EnglishTeacher englishTeacher;

    public EnglishTeacherCommand(EnglishTeacher englishTeacher) {
        this.englishTeacher = englishTeacher;
    }

    @Override
    public void execute() {
        englishTeacher.teachEnglish();
    }
}
