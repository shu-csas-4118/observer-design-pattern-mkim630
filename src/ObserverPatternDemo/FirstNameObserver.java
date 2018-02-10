package ObserverPatternDemo;

public class FirstNameObserver implements IObserver{
	
	private String type = "firstName";
	private Student student;
	
	public FirstNameObserver()
	{
		
	}
	public String getType() {
		return type;
	}
	public void update(Student student)	{
		System.out.println("Student's first name is " + student.getFirstName());
	}
}



// add an observer for receiving notifications when email changes
// add an observer when course is added or removed
// change notification in student class so that it only notifies the appropriate observer. right now, all observers are notified.
//example with student name, id number, and email being updated. add several courses to the student's list of courses and then remove a course. '