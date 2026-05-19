package uniman;

public class teacher {
	 protected int id;
	 private String name;
	 private String subject;

	 public teacher(int id, String name, String subject) {
	     this.id = id;
	     this.name = name;
	     this.subject = subject;
	    }

	    public void showTeacher() {
	        System.out.println("Teacher ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Subject: " + subject);
	        System.out.println("------------------------------");
	    }
}
