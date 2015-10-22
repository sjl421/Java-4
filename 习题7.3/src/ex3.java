import java.util.*; 

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar time = new GregorianCalendar();
		
		System.out.print(time.get(GregorianCalendar.YEAR) + "年");
		System.out.print(time.get(GregorianCalendar.MONTH) + "月");
		System.out.println(time.get(GregorianCalendar.DAY_OF_MONTH) + "日");
		
		time.setTimeInMillis(1234567898765L);
		
		System.out.print(time.get(GregorianCalendar.YEAR) + "年");
		System.out.print(time.get(GregorianCalendar.MONTH) + "月");
		System.out.println(time.get(GregorianCalendar.DAY_OF_MONTH) + "日");
	}

}
