package flyweight;

public class Demo {
    private static final String[] ROOM_NUMBERS = {"101", "102", "103", "104", "105"};
    private static final String[] SUBJECTS = {"Algebra", "Geometry", "Calculus", "Statistics", "Trigonometry"};

    public static void main(String[] args) {
        for(String roomNumber : ROOM_NUMBERS) {
            for(String subject : SUBJECTS) {
                Classroom classroom = ClassroomFactory.getClassroom(roomNumber);
                classroom.teach(subject);
            }
        }
    }
}
