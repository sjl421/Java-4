import java.util.*;


class Location
{

	public int row;
	public int column;
	public double maxValume;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String str = maxValume + " is at " + "(" + column + ","+row +")"; 
		return str;
	}
	

	public static Location locationLargest(double[][] a)
	{
		Location maxLocation = new Location();
		
		
		maxLocation.maxValume = a[0][0];
		maxLocation.row = 0;
		maxLocation.column = 0;
		
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a[0].length;j++)
			{
				if(a[i][j] > maxLocation.maxValume)
				{
					maxLocation.maxValume = a[i][j];
					maxLocation.row = j;
					maxLocation.column = i;
				}
				
			}
			
		}
		
		
		
		return maxLocation;
	}

}


public class ex4 {
	
	

	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array:");
		
		int colume = input.nextInt();
		int row = input.nextInt();
		
		double[][] array = new double[colume][row];
		System.out.println("Enter the array:");
		
		for(int i = 0;i < array.length;i++)
		{
			for(int j = 0;j < array[0].length;j++)
			{
				array[i][j] = input.nextDouble();
			}
			
		}
		
		
		System.out.println("The location of the largest element is " + Location.locationLargest(array));

	}



}
