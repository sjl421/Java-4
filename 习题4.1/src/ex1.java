
public class ex1 {

	
	
    public static class OldMacdonald
    {
    	
    	  String first[] = {	"chicks","chick","cows","moo","a"};
    	  String second[] = {"ducks","quack","pigs","oink","an"};
    	
    	  private void verses(String[] str)
    	  {
    		  System.out.println("Old MacDonald had a farm, e i e i o");
    		  System.out.println("And on his farm he had some " + str[0]+", e i e i o");
    		  System.out.println("with a chick chick here and a " + str[1] + " " + str[1]);
    		  System.out.println("there");
    		  System.out.println("here a chick there a " + str[1]); 
    		  System.out.println("everywhere a " + str[1] + " " + str[1]);
    		  System.out.println("Old MacDonald had a farm,e i e i o");
    		  System.out.println("");
    		  System.out.println("Old MacDonald had a farm, e i e i o");
    		  System.out.println("And on his farm he had some "+ str[2] + ", e i e i o");
    		  System.out.println("with "+str[4]+ " "+ str[3] + " "+ str[3] + " here and " + str[4]+ " "+ str[3] + " "+ str[3] + " there");
    		  System.out.println("here " + str[4]+ " "+ str[3] +" there " +  str[4]+ " "+ str[3]);
    		  System.out.println("everywhere a "+ str[3] + " "+ str[3]);
    		  System.out.println("Old MacDonald had a farm, e i e i o");
  
    	  }
    	  public void firstverses()
    	  {
    		  verses(first);
    	  }
    	
    	  public void secondverses()
    	  {
    		  verses(second);
    	  }
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OldMacdonald oldmac = new OldMacdonald();
		oldmac.firstverses();
		oldmac.secondverses();
	
	}

}
