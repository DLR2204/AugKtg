package intro;

public class MethodEx1 {
	
	
	public static String display() {//static - String
		return "Hi everyone";
	}
	
	
	public static void add(int a,int b) {//STATIC -void
		System.out.println("The sum is:-"+(a+b));
	}
	
	public static void main(String[] args) { //static-void
		
		System.out.println(display());
		
		add(34,67);
		
	}

}
