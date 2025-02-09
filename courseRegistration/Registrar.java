package courseRegistration;

import java.util.ArrayList;

public class Registrar {

	private ArrayList<Student> students;
	private ArrayList<Course> courses;

	public Registrar() {
		students = new ArrayList<>();
		courses = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);

	}

	public void removeStudent(Student student) {
		students.remove(student);

	}

	public void addCourse(Course course) {
		courses.add(course);

	}

	public void removeCourse(Course course) {
		courses.remove(course);

	}

	private Student findStudent(int id) {
		for (Student student : students) {
			if (student.getStudentID() == id) {
				return student;
			}
		}
		return null;
	}

	public void registerCourse(int studentID, String courseID) {
		Student student = findStudent(studentID);
		Course course = findCourse(courseID);

		if (studentID != 0 && courseID != null) {
			course.addStudent(student);
			student.registerCourse(course);
			// System.out.println(student.getStudentName()+" registered for "+
			// course.getCourseTitle());

		}

	}

	private Course findCourse(String id) {
		for (Course course : courses) {
			if (course.getCourseID().equals(id)) {
				return course;
			}
		}
		return null;
	}

	public void dropCourse(int studentID, String courseID) {
		Student student = findStudent(studentID);
		Course course = findCourse(courseID);

		if (studentID != 0 && courseID != null) {
			if (!student.getRegisteredCourses().contains(course)) {
				System.out.println(student.getStudentName() + " is not registered for " + course.getCourseTitle()
						+ ", so cannot drop it.");
				return;
			}
			course.removeStudent(student);
			student.dropCourse(course);
			System.out.println(student.getStudentName() + " dropped " + course.getCourseTitle());
		}
	}
}
