
class Rectangle
{
	private double width = 1;
	private double height = 1;
	
	double getWidth()
	{
		return this.width;
	}
	double getHeight()
	{
		return this.height;
	}
	public Rectangle(double width,double height)
	{
		this.width = width;
		this.height = height;
	}
	
	double getArea()
	{
		return this.height * this.height;
	}
	
	double getPerimeter()
	{
		return 2 * (this.height + this.width);
	}
	

	
}


public class ex1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect1 = new Rectangle(4, 40);

		System.out.println("矩形1的宽为=" + rect1.getWidth());
		System.out.println("矩形1的高为=" + rect1.getHeight());
		System.out.println("矩形1的面积为=" + rect1.getArea());
		System.out.println("矩形1的周长为=" + rect1.getPerimeter());


		
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		System.out.println("矩形2的宽为=" + rect2.getWidth());
		System.out.println("矩形2的高为=" + rect2.getHeight());
		System.out.println("矩形2的面积为=" + rect2.getArea());
		System.out.println("矩形2的周长为=" + rect2.getPerimeter());
		
		
	}

}
