package intro;

public class VariableEx2 {
	
	static int digit = 45; //static gloabal var
	
	int value = 67;  //instance gloabal var
	
	public static void main(String[] args) {
		
		int number = 34; //local var
		
		System.out.println(number);
		
		System.out.println(digit);
		
		VariableEx2 obj = new VariableEx2();
		
		System.out.println(obj.value);
		
	}

}
