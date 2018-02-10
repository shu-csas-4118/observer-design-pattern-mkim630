package ObserverPatternDemo;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<IObserver> observers;
	private ArrayList<Course> courses;
	
	public Student(String firstName, String lastName, int idNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.observers = new ArrayList<IObserver>();		
		this.courses = new ArrayList<Course>();
	}
	
	public Student() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyFirstNameObservers();
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyIdNumberObservers();
	}	
	
	
	
	public void setEmail(String email) {
		this.email = email;
		notifyEmailObservers();
	}
	
	public void notifyEmailObservers()
	{
		for(IObserver observer: this.observers) {
			if(observer.getType().equals("email"))
				observer.update(this);
		}
	}
	public void notifyIdNumberObservers()
	{
		for(IObserver observer: this.observers) {
			if(observer.getType().equals("idNumber"))
				observer.update(this);
		}
	}
	public void notifyFirstNameObservers()
	{
		for(IObserver observer: this.observers) {
			if(observer.getType().equals("firstName"))
				observer.update(this);
		}
	}
	public void notifyCourseObservers()
	{
		for(IObserver observer: this.observers) {
			if(observer.getType().equals("course"))
				observer.update(this);
		}
	}
		
	public String getEmail() {
		return this.email;
	}
	
	public void attachObserver(IObserver observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(IObserver observer: this.observers) {			
			observer.update(this);
		}
	}
	
	
	
	public void addCourse(Course course) {
		courses.add(course);
		notifyCourseObservers();
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
		notifyCourseObservers();
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
}