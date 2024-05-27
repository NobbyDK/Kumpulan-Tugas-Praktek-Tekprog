public class LowCoupling {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        Course course = new Course("Teknik Pemrograman");
        Student student = new Student("Nobby", notificationService);
        Enrollment enrollment = new Enrollment(student, course, notificationService);
        enrollment.enroll();
    }
}
