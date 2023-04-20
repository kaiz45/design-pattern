package IteratorPattern;

public class CourseList {
    private Course[] courses;

    public CourseList(Course[] courses) {
        this.courses = courses;
    }

    public CourseIterator getIterator() {
        return new CourseListIterator();
    }

    private class CourseListIterator implements CourseIterator {
        private int index;

        public CourseListIterator() {
            this.index = 0;
        }

        public boolean hasNext() {
            return index < courses.length;
        }

        public Course next() {
            Course course = courses[index];
            index++;
            return course;
        }
    }
}

