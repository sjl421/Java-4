
public class ex4 {

 static boolean isPrime(int n) 
 {  
        if (n <= 1) 
        {  
            return false;  
        }  
        int k = (int) Math.sqrt(n);  
        for (int i = 2; i <= k; i++) 
        {  
            if(n % i == 0) 
            {  
                return false;  
            }  
        }  
        return true;  
  }  

   static void isTwinPrime()
   {
     	int primer1 = 0;
     	int primer2 = 0;
    		for(int i = 1;i < 1000;i++)
    		{
    			if(isPrime(i))
    			{
    				if(primer1 == 0)
    				{
    					primer1 = i;
    				}
    				else
    				{
    					primer2 = i;
    					if(primer2 - primer1 == 2)
    					{
    						System.out.println("("+primer1 + "," + primer2 +")");
    					}
    					primer1 = primer2;
    				}
    			}
    			
    		}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isTwinPrime();
		
	}

}
