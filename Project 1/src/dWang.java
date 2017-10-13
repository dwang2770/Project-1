
public class dWang {
	public static String dateStr ( String a ) {
		String month= a.substring (0,2);
		String day= a.substring(3,5);
		String year= a.substring(6,10);
		return (day + "-" + month + "-" + year);
	}
	public static int sumUpTo (int n) {
		  int x = (n * (n + 1) / 2); 
		  return (x);
		  
		}
	public static boolean isPalindrome(String x) {
		String word= "";
			for (int n = x.length() -1; n == 0; n--) {
				word = word + x.charAt(n);
			}
				return (x.equals(word));
	}	
}
