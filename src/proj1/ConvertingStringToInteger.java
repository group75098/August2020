package proj1;

public class ConvertingStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		int inum = 100;

		/* converting the string to an int value by using parseint
		 * ,the value of inum2 would be 123 after
		 * conversion
		 */
		int inum2 = Integer.parseInt(str);
			
		int sum = inum+inum2;
		System.out.println("Result is: "+sum);
	}

}
