package ObserverPatternDemo;

public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		Student student = new Student("Matthew", "Kim", 123456, "yongkim@shu.edu");
		Course c1 = new Course("Math", 1001, 3, "Dr. Pak");
		Course c2 = new Course("Science", 1002, 4, "Dr. Marlowe");
		
		IdNumberObserver idObserver = new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		CourseObserver courseObserver = new CourseObserver();
		EmailObserver emailObserver = new EmailObserver();
		
		
	
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		student.notifyAllObservers(); //prints all info about student initially 
		System.out.println("Printed all student info first above." );
		System.out.println("No courses have been registered yet."+ "\n");
		
		student.setFirstName("Matt");// Name change
		student.setIdNumber(654321);// ID Number change
		student.setEmail("mkim630@gmail.com"); //Email change
		
		
		student.addCourse(c1); //adds course1 and notifies observer to print course info. 
		student.addCourse(c2); // same as above but with course2
	}
}
