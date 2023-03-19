package Com;

@FunctionalInterface
interface Sayable{
	public String say(String name); 
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1= (name)->{
			return "Hello "+name;
		};
		
		System.out.println(s1.say("Abhira"));

	}

}
