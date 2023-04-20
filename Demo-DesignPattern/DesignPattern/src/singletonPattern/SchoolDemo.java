package singletonPattern;

public class SchoolDemo {
    public static void main(String[] args) {
        School school1 = School.getInstance("High School", "123 Main St.");
        School school2 = School.getInstance("Elementary School", "456 Elm St.");

        System.out.println("Name of school 1: " + school1.getName());
        System.out.println("Address of school 1: " + school1.getAddress());
        System.out.println("Name of school 2: " + school2.getName());
        System.out.println("Address of school 2: " + school2.getAddress());

        System.out.println("Are school 1 and school 2 the same object? " + (school1 == school2));
    }
}
