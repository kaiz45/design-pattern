package flyweight;

import java.util.HashMap;

public class ClassroomFactory {
    private static HashMap<String, Classroom> classroomMap = new HashMap<>();

    public static Classroom getClassroom(String roomNumber) {
        Classroom classroom = classroomMap.get(roomNumber);

        if(classroom == null) {
            classroom = new MathClassroom(roomNumber);
            classroomMap.put(roomNumber, classroom);
        }

        return classroom;
    }
}
