
public class CheckSquare {
public boolean Check(int a1,int b1,int a2,int b2,int a3,int b3,int a4,int b4)
{
	if(a1==a2 && a3==a4 && b1==b3 && b2==b4)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSquare c=new CheckSquare();
		
		if(c.Check(20,10,20,20,10,10,10,20))
		{
			System.out.println("The points form square");
		}
		else
	{
	System.out.println("The points does not form a square");	
	}
	}
}
