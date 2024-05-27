import java.util.ArrayList;

class CourseManagement {
    private ArrayList<String> students;
    private ArrayList<String> courses;
    private ArrayList<String> enrollments;

    public CourseManagement() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void enrollStudent(String student, String course) {
        enrollments.add(student + " - " + course);
    }

    public void displayStudents() {
        System.out.println("Students:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("\n");
    }

    public void displayCourses() {
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println(course);
        }
        System.out.println("\n");
    }

    public void displayEnrollments() {
        System.out.println("Enrollments:");
        for (String enrollment : enrollments) {
            System.out.println(enrollment);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        CourseManagement cm = new CourseManagement();
        cm.addStudent("Nobby");
        cm.addStudent("Bino");
        cm.addCourse("Teknik Pemrograman");
        cm.addCourse("Struktur Data dan Algoritma");
        cm.enrollStudent("Nobby", "Teknik Pemrograman");
        cm.enrollStudent("Bino", "Struktur Data dan Algoritma");
        cm.displayStudents();
        cm.displayCourses();
        cm.displayEnrollments();
    }
}
