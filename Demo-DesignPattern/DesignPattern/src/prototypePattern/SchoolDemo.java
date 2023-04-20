package prototypePattern;

public class SchoolDemo {
    public static void main(String[] args) {
        School originalSchool = new School("My School", "123 Main St.", 1000, 50, true);
        School clonedSchool = originalSchool.clone();

        System.out.println("Original school: " + originalSchool.getName() + " at " + originalSchool.getAddress() + " has " + originalSchool.getNumStudents() + " students and " + originalSchool.getNumTeachers() + " teachers. Is it public? " + originalSchool.isPublic());
        System.out.println("Cloned school: " + clonedSchool.getName() + " at " + clonedSchool.getAddress() + " has " + clonedSchool.getNumStudents() + " students and " + clonedSchool.getNumTeachers() + " teachers. Is it public? " + clonedSchool.isPublic());

        originalSchool.setName("Your School");
        originalSchool.setAddress("456 Maple St.");
        originalSchool.setNumStudents(500);
        originalSchool.setNumTeachers(20);
        originalSchool.setPublic(false);

        System.out.println("Original school: " + originalSchool.getName() + " at " + originalSchool.getAddress() + " has " + originalSchool.getNumStudents() + " students and " + originalSchool.getNumTeachers() + " teachers. Is it public? " + originalSchool.isPublic());
        System.out.println("Cloned school: " + clonedSchool.getName() + " at " + clonedSchool.getAddress() + " has " + clonedSchool.getNumStudents() + " students and " + clonedSchool.getNumTeachers() + " teachers. Is it public? " + clonedSchool.isPublic());
    }
}
