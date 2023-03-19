package Com;


public class ObjectValue {
	static int i=1;
	
	int increment() {
		i++;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectValue ov=new ObjectValue();
		ObjectValue ov1=new ObjectValue();
		
		System.out.println(ov.increment());
		System.out.println(ov1.increment());

	}

}
