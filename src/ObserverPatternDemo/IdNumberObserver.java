package ObserverPatternDemo;

public class IdNumberObserver implements IObserver{
	
	private String type = "idNumber";
	private Student student;
	
	public IdNumberObserver() {
		
	}
	public String getType()
	{
		return type;
	}
	
	public void update(Student student) {
		System.out.println("Student's ID number is " + student.getIdNumber());
	}

}
