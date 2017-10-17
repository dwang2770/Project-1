
public class dWang {
	public static String dateStr ( String a ) {
		String month= a.substring (0,2);
		String day= a.substring(3,5);
		String year= a.substring(6,10);
		return (day + "-" + month + "-" + year);
	// takes a date in the given form mm//dd/yyyy to dd-mm-yyyy
	// using substrings to isolate mm, dd, yyyy and rearranging them to the new format
	}
	public static int sumUpTo (int n) {
		  int x = (n * (n + 1) / 2); 
		  return (x);
	// using a mathematical formula to calculate the sum of all numbers up to input value	  
		}
	public static boolean isPalindrome(String x) {
		String word= "";
			for (int n = x.length() -1; n == 0; n--) {
				word = word + x.charAt(n);
			}
				return (x.equals(word));
	//by using a for loop you can set a blank string to equal its reverse
		// this is done by having the for loop count down and having the charAt(0)
	// then you check if the reverse string and original string is equal to each other
	}	
}
