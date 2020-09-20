package proj1;

public class ConvertingIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 111;
		String str = String.valueOf(a); //convert int to String using String.valueOf() or Integer.toString() method
		System.out.println("String is: "+str); 
		//output is: 555111 because the str is a string 
		//and the + would concatenate the 555 and str
		System.out.println(555+str);
	}

}
