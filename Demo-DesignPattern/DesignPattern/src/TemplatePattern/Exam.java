package TemplatePattern;

public abstract class Exam {
    public void takeExam() {
        arriveAtExamRoom();
        readInstructions();
        takeTest();
        submitTest();
        leaveExamRoom();
    }

    public void arriveAtExamRoom() {
        System.out.println("Arriving at exam room...");
    }

    public abstract void readInstructions();

    public abstract void takeTest();

    public void submitTest() {
        System.out.println("Submitting test...");
    }

    public void leaveExamRoom() {
        System.out.println("Leaving exam room...");
    }
}
