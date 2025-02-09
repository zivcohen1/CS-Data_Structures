package courseRegistration;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String name;
	private ArrayList<Course> registeredCourses;

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		this.registeredCourses = new ArrayList<>();
	}

	public void registerCourse(Course course) {
		if (!registeredCourses.contains(course)) {
			registeredCourses.add(course);
			System.out.println(name + " registered for: " + course.getCourseTitle());
		}

	}

	public void dropCourse(Course course) {
		registeredCourses.remove(course);

	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return name;
	}

	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}

}
