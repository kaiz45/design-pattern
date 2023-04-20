package abstractFactoryPattern;

public class Demo {
    public static void main(String[] args) {
        School elementarySchool = new ElementarySchool();
        School middleSchool = new MiddleSchool();
        School highSchool = new HighSchool();

        SchoolMember student1 = elementarySchool.createSchoolMember("Alice");
        SchoolMember student2 = middleSchool.createSchoolMember("Bob");
        SchoolMember student3 = highSchool.createSchoolMember("Carol");

        System.out.println(student1.getName() + " is an " + student1.getRole() + " at an elementary school");
        System.out.println(student2.getName() + " is a " + student2.getRole() + " at a middle school");
        System.out.println(student3.getName() + " is a " + student3.getRole() + " at a high school");
    }
}

