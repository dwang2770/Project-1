
public class dWang {
// date str, is paliendrome, sumupto
	public static String datestr ( String a ) {
		String month= a.substring (0,2);
		String day= a.substring(3,5);
		String year= a.substring(6,10);
		return (day + "-" + month + "-" + year);
	}
	public static void sumUpTo (int n) {
		  System.out.println(n * (n + 1) / 2);
		    }
	
}
