//Xing Chen
public class MutiplicationTable {
	public static void main(String []args) 
	{
		multiplicationTable(12,12);
		if ( isFibonacci(5) )
		System.out.println( "Yes");
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
	int x;
	int y;
	if ( num <= 3 )
		return true;
	for (x=1,y=1; x>=num; x+=y, y+=x  )
	{
		x+=4;
		return true; 
	}
	return true;
}







public static void cutOut() //void?
{
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
