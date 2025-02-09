package courseRegistration;

public class Test {

	public static void main(String[] args) {
		Registrar reg = new Registrar();
		// add students
		Student s1 = new Student(12323, "Stav");
		Student s2 = new Student(24523, "Ziv");
		Student s3 = new Student(83424, "Roni");
		// add courses
		Course c1 = new Course("CS175L", "Data Structures", "Zang");
		Course c2 = new Course("MA220", "Prob & Stats", "Pang");
		Course c3 = new Course("CS205", "Computer Arch", "Yu");
		Course c4 = new Course("CS420", "Computer Networks", "Weiho");

		reg.addCourse(c4);
		reg.addCourse(c2);
		reg.addCourse(c3);

		reg.addStudent(s3);
		reg.addStudent(s2);
		reg.addStudent(s1);

		reg.registerCourse(24523, "MA220");
		reg.removeCourse(c4);
		reg.addCourse(c1);
		reg.registerCourse(12323, "CS175L");

		reg.dropCourse(24523, "MA220");
		reg.dropCourse(12323, "MA220");

		reg.removeCourse(c4);
		reg.removeStudent(s3);

	}

}
