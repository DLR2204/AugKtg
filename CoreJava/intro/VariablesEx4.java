package intro;

public class VariablesEx4 {

	static String nationality = "Indian"; //static global var
	
	int addhar; //instance global var
	
	public void display() {
		
		System.out.println("Nationality :-"+nationality);
		
		System.out.println("aadhar Number:-"+addhar);
		
	}
	
	public static void main(String[] args) {
		
		VariablesEx4 sasank = new VariablesEx4();
		
		VariablesEx4 surya = new VariablesEx4();
		
		VariablesEx4 nikhil = new VariablesEx4();
		
		
		sasank.addhar=1234;
		
		surya.addhar=4567;
		
		nikhil.addhar = 7890;
		
		
		System.out.println("Sasank:-");
		
		sasank.display();
		
		System.out.println("surya:-");
		
		surya.display();
		
		System.out.println("Nikhil:-");
		
		nikhil.display();
		
		
	}
	
	
}
