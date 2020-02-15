public enum Student {
    A("Linda", "female"), B("Bob", "Male"),
    C("Solider", "Male"), D("Cindy", "female");

    private String name;
    private String gender;

    Student() {
    }

    Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isFemale() {
        return this.gender.equals("female");
    }
}
