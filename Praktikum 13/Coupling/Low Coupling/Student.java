class Student {
    private String name;
    private NotificationService notificationService;

    public Student(String name, NotificationService notificationService) {
        this.name = name;
        this.notificationService = notificationService; // Low coupling
    }

    public void notifyStudent(String message) {
        notificationService.sendNotification(message);
    }

    public String getName() {
        return name;
    }
}
