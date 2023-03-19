package NewCom;

//Reverse a sentence

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="My name is Abhira";
		
		String[] str=a.split(" ");
		
		String rev="";
		
		for(int i=0;i<str.length;i++){
            rev = str[i]+" "+rev;
        }
		
		System.out.println("Reverse String is : "+rev);

	}

}
