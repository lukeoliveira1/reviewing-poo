package Courses;

class Course {
    private int id;
    private String name;
    private int durationHours;

    public Course(int id, String nome, int durationHours) {
        this.id = id;
        this.name = name;
        this.durationHours = durationHours;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Curso " + this.getName() + "\n";
    }
}
