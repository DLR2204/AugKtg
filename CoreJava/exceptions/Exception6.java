package exceptions;


class AgeNotValidException extends Exception{
	
	private int age;
	
	public AgeNotValidException() {
		
	}

	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}
//
//	@Override
//	public String toString() {
//		return "You are not eligible to vote:- "+age;
//	}
		
}


class Exception6{
	
	public static void valid(int age) throws AgeNotValidException {
		
		if(age>=18) {
			System.out.println("You r eligible to vote...");
		}
		
		else {
			
			throw new AgeNotValidException();
		}
		
		
	}
	
	public static void main(String[] args) throws AgeNotValidException {
		
		
		valid(2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}