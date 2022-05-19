package lesson9.studentImpl;

import lesson9.students.Course;

public class CourseImpl implements Course {
    private String courseName;

    public CourseImpl(String courseName){
        this.courseName = courseName;
    }


    @Override
    public String courseName() {
        return courseName;
    }
}
