package oops;

interface Parent1{
	
	public void display() ;
}

interface Parent2{
	
	public void display();
}



public class Child2 implements Parent1,Parent2{

	@Override
	public void display() {
		System.out.println("Hi everyone!!!!");
	}

	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		obj.display();
	}

}
