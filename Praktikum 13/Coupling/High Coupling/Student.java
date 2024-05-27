class Student {
    private String name;
    private NotificationService notificationService;

    public Student(String name) {
        this.name = name;
        this.notificationService = new NotificationService(); // High coupling
    }

    public void notifyStudent(String message) {
        notificationService.sendNotification(message);
    }

    public String getName() {
        return name;
    }
}