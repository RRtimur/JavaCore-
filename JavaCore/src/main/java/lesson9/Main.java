package lesson9;


import lesson9.studentImpl.CourseImpl;
import lesson9.studentImpl.StudentImpl;
import lesson9.students.Course;
import lesson9.students.Student;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CourseImpl courseMath = new CourseImpl("math");
        CourseImpl courseChemistry = new CourseImpl("chemistry");
        CourseImpl courseGYM = new CourseImpl("GYM");
        CourseImpl coursePhysics = new CourseImpl("physics");
        CourseImpl courseProcessOptimization = new CourseImpl("processOptimization");
        CourseImpl coursePsychology = new CourseImpl("psychology");
        CourseImpl newCourse = new CourseImpl("new course");

        Student student1 = new StudentImpl("Alexey", Arrays.asList(courseMath, courseChemistry, courseProcessOptimization,courseGYM, coursePhysics ));
        Student student2 = new StudentImpl("Alex", Arrays.asList(courseGYM, courseChemistry, coursePhysics,courseProcessOptimization));
        Student student3 = new StudentImpl("Andrey ", Arrays.asList(courseMath, courseChemistry, courseProcessOptimization,courseGYM));
        Student student4 = new StudentImpl("Mark", Arrays.asList(courseMath, courseGYM, coursePhysics));
        Student student5 = new StudentImpl("Misha", Arrays.asList(courseMath, courseChemistry, coursePsychology));


        uniqueCurse(Stream.of(student1, student2, student3, student4, student5))
                .forEach(student -> System.out.println("Хотя бы 1 из студентов посещает курс - " + student.courseName()));

        System.out.println();

        topStudents(Stream.of(student1, student2, student3, student4, student5))
                .forEach(student -> System.out.println("Входит в топ 3 студентов по кол-ву курсов - " + student.getName()));

        System.out.println();

        attendanceCourses(Stream.of(student1, student2, student3, student4, student5), courseMath)
                .forEach(student -> System.out.println(student.getName() + " посещает курс - " + courseMath.courseName()));
    }



    public static List<Course> uniqueCurse (Stream<Student> studentStream){
        return studentStream
                .map(Student::getAllCourses)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Student> topStudents (Stream<Student> studentStream){

        Comparator<Student> studentComparator = Comparator.comparingInt(student -> student.getAllCourses().size());

        return studentStream
                .sorted(studentComparator.reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Student> attendanceCourses (Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }

}
