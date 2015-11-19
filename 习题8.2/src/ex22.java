
public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = args[0];
		
		System.out.println(str);
		
		String[] strs = str.split(" ");
		int sum = 0;
		for(int i = 0; i < strs.length;i++)
		{
			sum += Integer.parseInt(strs[i]);
			
		}
		
		System.out.println("The total is " + sum);
		
		
	}

}
