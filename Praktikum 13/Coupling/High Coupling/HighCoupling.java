public class HighCoupling {
    public static void main(String[] args) {
        Course course = new Course("Teknik Pemrograman");
        Student student = new Student("Nobby");
        Enrollment enrollment = new Enrollment(student, course);
        enrollment.enroll();
    }
}
