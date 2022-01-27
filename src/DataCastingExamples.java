
public class DataCastingExamples {

	public static void main(String[] args) {
		
		/* Casting a smaller data type to a larger data type.
		 * 
		int bobAccount = 10;
		double bobDouble = bobAccount;
		
		System.out.println(bobAccount);
		System.out.println(bobDouble);
		*/
		
		double bobAccount = 10.55;
		int bobInt = (int) bobAccount; // Casting in this direction must be done manually.
		
		System.out.println(bobAccount);
		System.out.println(bobInt);

	}

}
