package builderPattern;

public class School {
    private final String name;
    private final String address;
    private final int numStudents;
    private final int numTeachers;
    private final boolean isPublic;

    private School(String name, String address, int numStudents, int numTeachers, boolean isPublic) {
        this.name = name;
        this.address = address;
        this.numStudents = numStudents;
        this.numTeachers = numTeachers;
        this.isPublic = isPublic;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumStudents() {
        return this.numStudents;
    }

    public int getNumTeachers() {
        return this.numTeachers;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public static class SchoolBuilder {
        private String name;
        private String address;
        private int numStudents;
        private int numTeachers;
        private boolean isPublic;

        public SchoolBuilder() {}

        public SchoolBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SchoolBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public SchoolBuilder withNumStudents(int numStudents) {
            this.numStudents = numStudents;
            return this;
        }

        public SchoolBuilder withNumTeachers(int numTeachers) {
            this.numTeachers = numTeachers;
            return this;
        }

        public SchoolBuilder withIsPublic(boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public School build() {
            return new School(name, address, numStudents, numTeachers, isPublic);
        }
    }
}

