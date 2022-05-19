package lesson9.studentImpl;

import lesson9.students.Course;
import lesson9.students.Student;

import java.util.List;

public class StudentImpl implements Student {
    private String name;
    private  List<Course> courses;


    public StudentImpl(String name, List<Course> courses){
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}
