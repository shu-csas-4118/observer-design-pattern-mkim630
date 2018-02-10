package ObserverPatternDemo;

public class EmailObserver implements IObserver{

	private String type = "email";
	private Student student;
	
		public EmailObserver() {}
		
		public String getType() {
			return type;
		}
		
		public void update(Student student)
		{
			System.out.println("Student's email address is " + student.getEmail());
		}
}
