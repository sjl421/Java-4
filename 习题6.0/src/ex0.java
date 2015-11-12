import java.util.ArrayList;


class Suduk
{
	int [] answer = 
	{
		5,3,4,6,7,8,9,1,2,
		6,7,2,1,9,5,3,4,8,
		1,9,8,3,4,2,5,6,7,
		8,5,9,7,6,1,4,2,3,
		4,2,6,8,5,3,7,9,1,
		7,1,3,9,2,4,8,5,6,
		9,6,1,5,3,7,2,8,4,
		2,8,7,4,1,9,6,3,5,
		3,4,5,2,8,6,1,7,9,		
	};
	
void Verresult()
{
    
    for(int i = 0;i < answer.length;i++)
    {
        int cal = i / 9;
        int row = i % 9;
        if (!Verresult(i)) {
        	    System.out.printf("第%d行%d列有误!\n",cal,row);
            return;
        }
    }
    System.out.printf("数独是正确的\n");
    
}


boolean Verresult(int Position)
{
    ArrayList<Integer> colArr = new ArrayList<Integer>();
    ArrayList<Integer> rowArr = new ArrayList<Integer>();
    ArrayList<Integer> cr9Arr = new ArrayList<Integer>();
    
    
    int cal = Position / 9;
    int row = Position % 9;
    
    int cal_3_3 = cal / 3;
    int row_3_3 = row / 3;
    
    for (int i = 0; i < answer.length; i++)
    {
        //1.0 行元素数组
        //UITextField *uiText = (UITextField *)self.ButtonView.subviews[i];
        if (i / 9 == cal ) {
            if(answer[i] != 0)
            {
                colArr.add(answer[i]);
            }
        }
        //2.0 列元素数组
        if (i % 9 == row) {
            if(answer[i] != 0)
            {
                rowArr.add(answer[i]);
            }
        }
        //3.0 九宫格数组
        if ((i / 9 ) / 3== cal_3_3 && (i % 9) / 3 == row_3_3) {
            if(answer[i] != 0)
            {
            		cr9Arr.add(answer[i]);
            }
        }
        
    }

    
    if(isRepeat(colArr) || isRepeat(rowArr) ||isRepeat(cr9Arr))
    {
        return false;//有重复 结果错误
    }

    return true;//没有重复 结果正确
    
}


	boolean isRepeat(ArrayList<Integer> arr)
	{
	    for (int i = 0; i < arr.size(); i++)
	    {
	        for(int j = 0;j < arr.size();j++)
	        {
	            if (i != j)
	            {
	                if (arr.get(i) == arr.get(j))
	                {
	                    return true;
	                }
    
	            }
	        }
	    }
	    return false;
	    
	}

}

public class ex0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suduk sudo = new Suduk();
		sudo.Verresult();

	}

}
