package intro;

public class ConstructorEx1 {
	
	public ConstructorEx1() {
		this("Apple");  //calling parametrized constr
	}
	
	public ConstructorEx1(String name) {
		this("Ball","Cat");
		System.out.println(name);
	}
	
	public ConstructorEx1(String name,String name1) {
		this("Duck","Egg","Fish");
		System.out.println(name +"\t"+name1);
	}
	
	public ConstructorEx1(String name1,String name2,String name3) {
		System.out.println(name1+"\t"+name2+"\t"+name3);
	}

	public static void main(String[] args) {
		
		ConstructorEx1 obj = new ConstructorEx1();
		
	}
}
