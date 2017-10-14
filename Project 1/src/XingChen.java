//Xing Chen
public class XingChen {
	
public static void 	multiplicationTable(int base,int limit)
{

	int y=1; 
	while ( y!=limit+1 ) //as long as y is not equal to limit+1 it will loop
	{
		System.out.print( base*(y)+ " " ); //print out base*y with a space
		y++; //value of y is increased by 1
	}
	System.out.println(" "); //next line after loop ends

}
	
public static boolean isFibonacci(int num)
{
	int x=0, y=1, z=0; 
	while (z <num ) //loops when z is smaller than num
	{
		z = x + y;  //z is the sum of x and y
 		x = y;  //x is given the value of y 
		y = z; //y is given the value of z
		
	}
	if (z==num) //if at the end of the loop  z is equal to num return true
	{
		System.out.println("Yes"); //prints out yes if true
		return true;
	}
	  else return false;
}



public static String cutOut(String mainStr, String subStr) 
{
	String original = mainStr; //mainStr is called original
	String newString = original.replaceFirst ( subStr, ""); //new string is original but with the first instance of whatever subStr is replaced with blank
	System.out.println(newString);
	return newString; //returns the new string
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
