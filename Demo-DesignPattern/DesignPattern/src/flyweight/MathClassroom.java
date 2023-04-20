package flyweight;

public class MathClassroom implements Classroom {
    private String roomNumber;

    public MathClassroom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void teach(String subject) {
        System.out.println("Teaching " + subject + " in Math classroom " + roomNumber);
    }
}
