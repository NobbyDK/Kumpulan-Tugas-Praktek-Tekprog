class Enrollment {
    private Student student;
    private Course course;
    private NotificationService notificationService;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.notificationService = new NotificationService(); // High coupling
    }

    public void enroll() {
        String message = "Mahasiwa " + student.getName() + " Telah terdaftar di Mata Kuliah " + course.getCourseName();
        notificationService.sendNotification(message);
    }
}
