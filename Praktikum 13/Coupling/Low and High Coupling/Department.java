import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public Department() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
    }

    public void displayAllEnrollments() {
        for (Enrollment enrollment : enrollments) {
            enrollment.displayEnrollmentDetails();
        }
    }
}

