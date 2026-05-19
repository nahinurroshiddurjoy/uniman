package uniman;

public class student {
	protected int id;
	private String name;
	private String department;
	private int semester;
	
	public student(int id, String name, String department, int semester) {
		this.id = id;
		this.setName(name);
		this.setDepartment(department);
		this.setSemester(semester);
	}
	
	public void showStudent() {
		System.out.println("Student ID: "+ id);
		System.out.println("Name: "+ getName());
		System.out.println("Department: "+ getDepartment());
		System.out.println("Semester: "+ getSemester());
		System.out.println("-------------------------------");
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
