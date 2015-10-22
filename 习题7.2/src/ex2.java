
class RegularPolygon
{
	private int n = 3;
	
	private double side = 1;
	
	private double x = 0;
	private double y = 0;
	
	void setN(int n)
	{
		this.n = n;
	}
	int getN()
	{
		return this.n;
	}
	
	void setSide(int side)
	{
		this.side = side;
	}
	double getSide()
	{
		return this.side;
	}
	
	void setX(int x)
	{
		this.x = x;
	}
	double getX()
	{
		return this.x;
	}
	void setY(int y)
	{
		this.y = y;
	}
	double getY()
	{
		return this.y;
	}
	
	public RegularPolygon()
	{
		
	}
	public RegularPolygon(int n,double side)
	{
		this.n = n;
		this.side = side;
	}

	public RegularPolygon(int n,double side,double x,double y)
	{
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	
	double getPerimeter()
	{
		return this.n * this.side;
	}

	double getArea()
	{
		double num1 = n * side * side;
		double num2 = 4 * Math.tan(Math.PI / n);
		double area = num1 / num2;
		return area;
	}

	void print()
	{
		System.out.println("周长=" + this.getPerimeter());
		System.out.println("面积=" + this.getArea());
	}
}



public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon re1 = new RegularPolygon();
		System.out.println("re1");
		re1.print();
		
		RegularPolygon re2 = new RegularPolygon(6,4);
		System.out.println("re2");
		re2.print();
		
		RegularPolygon re3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("re3");
		re3.print();
		
		
		
		

	}

}
