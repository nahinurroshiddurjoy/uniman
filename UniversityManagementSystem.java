package uniman;

import java.util.*;

public class UniversityManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<student> students = new ArrayList<>();
    static ArrayList<teacher> teachers = new ArrayList<>();
    static ArrayList<String> courses = new ArrayList<>();

    static String username = "nahin";
    static String password = "90909090";

    public static void main(String[] args) {

        boolean loginSuccess = login();

        if (loginSuccess == false) {
            System.out.println("Too many wrong attempts. Program closed!");
            return;
        }

        while (true) {
            System.out.println("\n--- WELCOME TO UNIMAN ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Add Teacher");
            System.out.println("5. View Teacher");
            System.out.println("6. Add Course");
            System.out.println("7. View Course");
            System.out.println("8. Developer Info");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                addStudent();
            } 
            else if (choice == 2) {
                viewStudents();
            } 
            else if (choice == 3) {
                searchStudent();
            } 
            else if (choice == 4) {
                addTeacher();
            } 
            else if (choice == 5) {
                viewTeachers();
            } 
            else if (choice == 6) {
                addCourse();
            } 
            else if (choice == 7) {
                viewCourses();
            } 
            else if (choice == 8) {
                viewdeveloper();
            } 
            else if (choice == 9) {
                System.out.println("Thank you for using UNIMAN!");
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static boolean login() {
        System.out.println("---- Login First ----");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Username: ");
            String inputUsername = sc.next();

            System.out.print("Enter Password: ");
            String inputPassword = sc.next();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login Successful!");
                return true;
            } else {
                System.out.println("Wrong Username or Password!");
                System.out.println("Attempts left: " + (3 - i));
            }
        }

        return false;
    }

    public static void addStudent() {
    	try {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();

        student s = new student(id, name, department, semester);

        students.add(s);

        System.out.println("Student added successfully!");
    	}
    	catch(Exception e) {
    		System.out.println("Invalid input! Check the input types.");
            sc.nextLine();
    	}
    }
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n---- STUDENT LIST ----");

        for (student s : students) {
            s.showStudent();
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int searchId = sc.nextInt();

        for (student s : students) {
            if (s.id == searchId) {
                System.out.println("Student found!");
                s.showStudent();
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public static void addTeacher() {
    	try {
        System.out.print("Enter Teacher ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Teacher Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        teacher t = new teacher(id, name, subject);
        teachers.add(t);

        System.out.println("Teacher added successfully!");
    }
    	catch(Exception e) {
    		System.out.println("Invalid input! Check the input types.");
            sc.nextLine();
    	}
    }

    public static void viewTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers found.");
            return;
        }

        System.out.println("\n---- TEACHER LIST ----");

        for (teacher t : teachers) {
            t.showTeacher();
        }
    }

    public static void addCourse() {
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        courses.add(courseName);

        System.out.println("Course added successfully!");
    }

    public static void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\n---- COURSE LIST ----");

        for (String course : courses) {
            System.out.println("Course: " + course);
        }
    }
    public static void viewdeveloper() {
    	String department = "CSE";
		String name = "NAHIN UR ROSHID DURJOY";
		int id = 274;
		int semester = 6;
		developer d = new developer(id, name, department, semester);
		System.out.println("\n-----Developer List-----");
		d.showdeveloper();
    }
}
