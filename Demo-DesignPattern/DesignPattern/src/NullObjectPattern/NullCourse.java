package NullObjectPattern;

class NullCourse extends Course {
    @Override
    public String getName() {
        return "No such course exists.";
    }
}

