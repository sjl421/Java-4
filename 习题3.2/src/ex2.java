import java.util.Scanner;


public class ex2 {


	public static class Triangle
	{
		double edges1;
		double edges2;
		double edges3;
		
		public void setEdges(double e1,double e2,double e3)
		{
			edges1 = e1;
			edges2 = e2;
			edges3 = e3;	
		}
		
		public boolean judge()
		{
			if(edges1 + edges2 > edges3 && edges1 + edges3 > edges2 && edges2 + edges3 > edges1)
			return true;
			else
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three edges:");

		Scanner input = new Scanner(System.in);
		
		Triangle triangle = new Triangle();
		double ed1 = input.nextDouble();
		double ed2 = input.nextDouble();
		double ed3 = input.nextDouble();
		
		triangle.setEdges(ed1, ed2, ed3);
		System.out.println("Can edges " + ed1 +"," + ed2 + "and " +ed3 + " from trianglle? " + triangle.judge());
		
		
	}

}
