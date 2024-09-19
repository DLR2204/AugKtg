package oops;

class GrandParent{
	public void displyMsg() {
		System.out.println("Iam from the grand parent class");
	}
}

class Parent extends GrandParent{
	
	int value = 45; //instance - global
	
	public void display() {
		
		System.out.println("Im from the parent class");
	}
	
}

public class Child extends Parent{
	
	public static void main(String[] args) {
	
		Child obj = new Child();
		
		System.out.println(obj.value);
		
		obj.display();
		
		obj.displyMsg();
		
	}

}
