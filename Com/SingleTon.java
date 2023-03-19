package Com;

public class SingleTon {
	
	private static SingleTon instance;
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		
		if(instance==null) {
			instance=new SingleTon();
		}
		
		return instance;
		
		//in this way we can instance class even though we have private contructor, and have only one 
		//instance and provide globale point of access to it.
		
		//one more way
		//return new SingleTon();	
		//can call this method as SingleTon.getInstance(), it will return a instantiate singleton class
	}

}
