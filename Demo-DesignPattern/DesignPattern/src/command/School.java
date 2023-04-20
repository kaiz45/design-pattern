package command;

public class School {
    private SchoolCommand mathCommand;
    private SchoolCommand englishCommand;
    private SchoolCommand scienceCommand;

    public void setMathCommand(SchoolCommand mathCommand) {
        this.mathCommand = mathCommand;
    }

    public void setEnglishCommand(SchoolCommand englishCommand) {
        this.englishCommand = englishCommand;
    }

    public void setScienceCommand(SchoolCommand scienceCommand) {
        this.scienceCommand = scienceCommand;
    }

    public void teachMath() {
        mathCommand.execute();
    }

    public void teachEnglish() {
        englishCommand.execute();
    }

    public void teachScience() {
        scienceCommand.execute();
    }
}

