package exceptions;

class Exception2 {
	public static void main(String[] args) {
		try {
			int a1 = 10;
			int b = 2;
			int c = a1 / 2;
			System.out.println("9.The result is :-" + c);
		} catch (ArithmeticException ae) {
			System.out.println("11.dont enter zero as denominater");
		}
		try {
			int a[] = new int[5];// 0,1,2,3,4 
			a[2] = 1;
			a[0] = 6;
			System.out.println("17.No error in the 2nd try block");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("19.array maximum size is 4");
		}

		
		System.out.println("23.remaining lines of code");
	}
}