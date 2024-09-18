package intro;

public class VariablesEx3 {

	static int staticCounter; //static global var
	
	int instanceCounter; //instance global var
	
	
	public void counter() {
		staticCounter++; //staticCounter = staticCounter+1
		
		instanceCounter++;
	}
	
	public void display() {
		System.out.println("Static Counter:-"+staticCounter);
		
		System.out.println("Instance Counter:-"+instanceCounter);
	}
	
	public static void main(String[] args) {
		
		VariablesEx3 obj1=new VariablesEx3();
		
		VariablesEx3 obj2=new VariablesEx3();
		
		VariablesEx3 obj3=new VariablesEx3();
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.counter();
		
		obj3.display();
		
		
	}
}
