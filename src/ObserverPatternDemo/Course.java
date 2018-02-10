package ObserverPatternDemo;

public class Course {
	
	private String courseName;     
	private int courseNumber;       
	private int credit;             
	private String professor;    
	
	public Course(String courseName, int courseNumber, int credit, String professor)
	{
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.credit = credit;
		this.professor = professor;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCourseNumber() {
		return this.courseNumber;
	}
	
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public int getCredit() {
		return this.credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public String getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	
}
	