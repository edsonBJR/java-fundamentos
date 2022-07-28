package padroesProjeto.singleton;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		
		// Illegal Constructor
		// Compile Time Error: The Constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();
		
		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		// Show the message
		object.showMessage();
	}

}
