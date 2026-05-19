package uniman;

public class developer extends student{

	public developer(int id, String name, String department, int semester) {
		super(id, name, department, semester);
	}
	public void showdeveloper() {
		System.out.println("Student ID: "+ id);
		System.out.println("Name: "+ getName());
		System.out.println("Department: "+ getDepartment());
		System.out.println("Semester: "+ getSemester());
		System.out.println("-------------------------------");
	}


}
