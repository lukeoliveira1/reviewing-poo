package Courses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void enrollStudentInCourse(Student student, Course course) {
        student.addCourse(course);
    }

    static void associateTeacherToCourse(Teacher teacher, Course course) {
        teacher.addCourse(course);
    }

    static List<Student> listStudentOfCourse(Course course, List<Student> students) {
        ArrayList<Student> studentsOfCourse = new ArrayList<>();

        for (Student student : students) {
            if (student.getEnrolledCourses().contains(course)) {
                studentsOfCourse.add(student);
            }
        }

        return studentsOfCourse;
    }

    static List<Teacher> listTeacherOfCourse(Course course, List<Teacher> teachers) {
        ArrayList<Teacher> teachersOfCourse = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.getEnrolledCourses().contains(course)) {
                teachersOfCourse.add(teacher);
            }
        }

        return teachersOfCourse;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        Course course1 = new Course(1, "Java Programming", 40);
        Course course2 = new Course(2, "Data Structures", 30);
        Course course3 = new Course(3, "Algorithms", 35);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        Teacher teacher1 = new Teacher(1, "Alice", new ArrayList<>());
        Teacher teacher2 = new Teacher(2, "Bob", new ArrayList<>());

        teachers.add(teacher1);
        teachers.add(teacher2);

        Student student1 = new Student(1, "Charlie", new ArrayList<>());
        Student student2 = new Student(2, "David", new ArrayList<>());
        Student student3 = new Student(3, "Eve", new ArrayList<>());

        students.add(student1);
        students.add(student2);
        students.add(student3);

        associateTeacherToCourse(teacher1, course1);
        associateTeacherToCourse(teacher2, course2);
        associateTeacherToCourse(teacher2, course3);

        enrollStudentInCourse(student1, course1);
        enrollStudentInCourse(student2, course1);
        enrollStudentInCourse(student2, course2);
        enrollStudentInCourse(student3, course3);

        List<Student> enrolledStudents = listStudentOfCourse(course1, students);
        System.out.println(enrolledStudents);

        List<Teacher> associatedTeachers = listTeacherOfCourse(course1, teachers);
        System.out.println(associatedTeachers);
    }
}
