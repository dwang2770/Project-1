//Xing Chen
public class MutiplicationTable {
	public static void main(String []args) 
	{
		multiplicationTable(12,12);
		if ( isFibonacci(12) )
		System.out.println( "Yes");
		System.out.println(cutOut("RandomWordsAreRandom" , "Random" ))
	}	
public static void 	multiplicationTable(int base,int limit)
{

	int y=1;
	while ( y!=limit+1 )
	{
		System.out.print( base*(y)+ " " );
		y++;
	}
	System.out.println(" ");

}
	
public static boolean isFibonacci(int num)
{
	int x=0, y=1, z=0;
	while (z <num )
	{
		z = x + y;
		x = y; 
		y = z; 
		
	}
	if (z==num)
		return true;
	else return false;
}



public static String cutOut(String mainStr, String subStr) 
{
	String original = mainStr;
	String newString = original.replaceFirst ( subStr, "");
	return newString;

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
