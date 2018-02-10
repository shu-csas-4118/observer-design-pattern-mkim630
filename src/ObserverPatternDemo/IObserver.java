package ObserverPatternDemo;


public interface IObserver {
	
	String getType();
	void update(Student student);
}
