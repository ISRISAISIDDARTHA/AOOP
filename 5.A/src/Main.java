public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");
        EnrollmentService enrollmentService = new Enrollment1();
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student2, course2);
        System.out.println(student1.getName() + " enrolled in " + student1.getCourses().get(0).getCourseName());
        System.out.println(student2.getName() + " enrolled in " + student2.getCourses().get(0).getCourseName());
    }
}
