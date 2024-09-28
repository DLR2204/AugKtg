package exceptions;

public class Exception3 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];// 0,1,2,3,4
			a[9] = 30 / 1;
			String s = "hello";
			int x = Integer.parseInt(s,29);

			System.out.println("11"+x);

			System.out.println("13"+s.length());
			System.out.println("14.no error  " + a[1]);

		}
		catch (Exception e) {
			System.out.println("26.not handled  " + e);
		} 
//		catch (ArithmeticException e) {
//			System.out.println("17.dont enter zero denominator");
//
//		} catch (ArrayIndexOutOfBoundsException Ae) {
//			System.out.println("20.index maximum size crossed");
//
//		} catch (NumberFormatException e) {
//			System.out.println("23.unable to convert string to number");
//
//		}

		finally { // it will print in any case
			System.out.println("30.executes every time for closing connections");
		}
		System.out.println("32.remaining code  executed...");

	}
}