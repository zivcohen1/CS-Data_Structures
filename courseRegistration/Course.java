package courseRegistration;

import java.util.ArrayList;

public class Course {
	private String courseID;
	private String courseTitle;
	private String instructor;
	private ArrayList<Student> enrolledStudents;

	public Course(String courseID, String courseTitle, String instructor) {
		this.courseID = courseID;
		this.courseTitle = courseTitle;
		this.instructor = instructor;
		this.enrolledStudents = new ArrayList<>();
	}

	public void addStudent(Student student) {
		if (!enrolledStudents.contains(student)) {
			enrolledStudents.add(student);

		}

	}

	public void removeStudent(Student student) {
		if (enrolledStudents.contains(student)) {
			enrolledStudents.remove(student);
		}

	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public String getCourseID() {
		return courseID;
	}

}
