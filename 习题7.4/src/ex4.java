import java.util.Scanner;


public class ex4 {

	
	public static int endIndex(String str,int index)
	{
		String end1 = "TAG";
		String end2 = "TAA";
		String end3 = "TGA";
		
		int index1 = str.indexOf(end1,index);
		int index2 = str.indexOf(end2,index);
		int index3 = str.indexOf(end3,index);

		int[] indexes = {index1,index2,index3};
		int tureIndex = -1;
		for(int i =0;i < 3;i++)
		{
			if(indexes[i] != -1)
			{
				if(tureIndex == -1 || indexes[i] < tureIndex)
				tureIndex = indexes[i];
			}
	
		}

		return tureIndex;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a genome string:");
		String str = input.next();
		String start = "ATG";

		int startIndex = 0;
		int endIndex = 0;
		
		//记录基因的条数
		int subStrCount = 0;
		
		while(true)
		{
			//TTATGTTTTAAGAAGGATGGGGCGTTAGTT
			//TGTGTGTATAT
			startIndex = str.indexOf(start,endIndex) + 3;
			endIndex = endIndex(str,startIndex);
			
			//当start找不到时,startIndex = -1 + 3 = 2
			if(startIndex == 2 || endIndex == -1)
			{
				break;
			}
			System.out.println(str.substring(startIndex, endIndex));
			subStrCount ++;
			
		}

		//基因条数为0 证明没有找到
		if(subStrCount == 0)
		{
			System.out.println("no gene is found");
		}

		input.close();
	}

}
