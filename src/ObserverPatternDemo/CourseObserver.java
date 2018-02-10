package ObserverPatternDemo;

import java.util.ArrayList;

public class CourseObserver implements IObserver {

	private String type = "course";
	private Student student;
	
	public CourseObserver() {
		
	}
	
	public String getType() {
		return type;
	}
	public void printCourses(ArrayList<Course> courses) {
		
		for(Course course: courses) {
			System.out.println("--------------------------------------------- ");
			System.out.println("Course information are as follows: ");
			System.out.println("Course name is " + course.getCourseName());
			System.out.println("Course number is " + course.getCourseNumber());
			System.out.println("Course credit is " + course.getCredit());
			System.out.println("Course professor is " + course.getProfessor());	
			System.out.println("--------------------------------------------- ");				
		}
		
	}
	
	
	public void update(Student s) {
		printCourses(s.getCourses());
		
	}
}
