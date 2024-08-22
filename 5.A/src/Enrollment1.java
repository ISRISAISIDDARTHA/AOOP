public class Enrollment1 
implements EnrollmentService {
    @Override
    public void enroll(Student student, Course course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}
