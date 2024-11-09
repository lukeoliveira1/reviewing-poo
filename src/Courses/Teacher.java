package Courses;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private int id;
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Teacher(int id, String name, ArrayList<Course> enrolledCourses) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = enrolledCourses;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addCourse(Course course) {
        this.enrolledCourses.add(course);
    }

    public void removeCourse(Course course) {
        for (Course c : this.enrolledCourses) {
            if (c.getName().equals(course.getName())) {
                this.enrolledCourses.remove(c);
            }
        }
    }

    @Override
    public String toString() {
        return "Professor " + name + '\n';
    }
}
