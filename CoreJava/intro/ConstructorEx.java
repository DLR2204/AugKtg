package intro;

public class ConstructorEx {
	
	public ConstructorEx() {
		System.out.println("Im from the defult constructor");
	}
	
	public ConstructorEx(String name) {
		System.out.println("Im from the parametrized constructor");
		
		System.out.println("The name is :-"+name);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("SteveJobss");
		
	}

}
