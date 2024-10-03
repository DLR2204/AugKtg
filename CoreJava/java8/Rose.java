package java8;

public class Rose {

	public static void main(String[] args) {
		
		
	Flower obj1 = new Flower() {

		@Override
		public void name(String name) {
			System.out.println("the name of the flower is:-"+name);
			
		}
		
	};
		
		
	Flower obj2 =(name)->
		System.out.println("The flower name is:-"+name);
	
		obj2.name("rose");	
		
		obj1.name("tulips");
			
	}
}
