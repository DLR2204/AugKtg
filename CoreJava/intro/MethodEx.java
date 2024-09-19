package intro;

public class MethodEx {
	
	public String display() {   //String -Dynamic
		return "hi everyone Im from the method body";
		
	}
	public int add(int a,int b) { //int  - Dynamic
		return (a+b);}
	
	public void Hi() {//void -returning nothing - dynamic
		System.out.println("Hello Everyone");
	}
	
	
	public static void main(String[] args) { //static
		
		MethodEx obj = new MethodEx();  //obj intialization
		
		System.out.println(obj.display());
		
		System.out.println(obj.add(45,75));
		
		obj.Hi();
		
	}
	
}
