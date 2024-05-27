public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nobby", "26735");
        Student student2 = new Student("Bino", "26736");

        Course course1 = new Course("Teknik Pemrograman", "A0012");
        Course course2 = new Course("Struktur Data dan Algoritma", "A0013");

        Enrollment enrollment1 = new Enrollment(student1, course1);
        Enrollment enrollment2 = new Enrollment(student2, course2);

        System.out.println("Low Coupling Test:");
        enrollment1.displayEnrollmentDetails();
        enrollment2.displayEnrollmentDetails();

        System.out.println("\nHigh Coupling Test:");
        Department department = new Department();
        department.addStudent(student1);
        department.addStudent(student2);
        department.addCourse(course1);
        department.addCourse(course2);
        department.enrollStudent(student1, course1);
        department.enrollStudent(student2, course2);
        department.displayAllEnrollments();
    }
}
