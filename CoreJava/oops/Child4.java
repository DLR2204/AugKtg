package oops;
class MethodOverriding{
	
	public void add(int a,int b) {
		System.out.println("The mul is:-"+(a*b));
	}
	
	public void display() {
		System.out.println("Im from the parent class");
	}
}


public class Child4 extends MethodOverriding{
	
	
	public static void main(String[] args) {
		
		Child4 obj = new Child4();
		
		obj.add(6, 8);
		
		obj.display();
		
	}
	
	@Override
	public void add(int a,int b) {
		System.out.println("The sum is:-"+(a+b));
	}
	
	
	
	
	
	
	
	

}
