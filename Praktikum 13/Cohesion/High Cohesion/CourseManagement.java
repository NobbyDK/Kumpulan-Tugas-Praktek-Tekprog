import java.util.ArrayList;

class CourseManagement {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Enrollment> enrollments;

    public CourseManagement() {
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
        enrollments.add(new Enrollment(student, course));
    }

    public void displayStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println("\n");
    }

    public void displayCourses() {
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println("\n");
    }

    public void displayEnrollments() {
        System.out.println("Enrollments:");
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        CourseManagement cm = new CourseManagement();
        Student Nobby = new Student("Nobby");
        Student Bino = new Student("Bino");
        Course Tekprog = new Course("Teknik Pemrograman");
        Course SDA = new Course("Struktur Data dan Algoritma");

        cm.addStudent(Nobby);
        cm.addStudent(Bino);
        cm.addCourse(Tekprog);
        cm.addCourse(SDA);
        cm.enrollStudent(Nobby, Tekprog);
        cm.enrollStudent(Bino, SDA);
        cm.displayStudents();
        cm.displayCourses();
        cm.displayEnrollments();
    }
}