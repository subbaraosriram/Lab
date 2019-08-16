interface Shape
{
  public double PI = 3.14;
  public double area();
}
interface Color
{
  public String getColor();
}
class Circle implements Shape,Color
{
    private int radius;
    private String color;
    Circle(int radius,String color)
	{
	   this.radius = radius;
	   this.color = color;
	}
	public String getColor()
    {
	   return this.color;
	}
    public double area()
    {
       return PI*radius*radius;
    }
}	
class Tri implements Shape,Color
{
    private int height,width;
    private String color;
    Tri(int height,int width,String color)
	{
	   this.width=width;
	   this.height=height;
	   this.color=color;
	}
	public String getColor()
    {
	   return this.color;
	}
    public double area()
    {
       return (height*width)/2;
    }
}
public class SampleInter
{
  public static void main(String args[])
  {
    Tri t1=new Tri(23,45,"red");
	Circle c1=new Circle(346,"blue");
	System.out.println(" Circle color :"+c1.getColor());
	System.out.println(" Circle Area :"+c1.area());
	System.out.println(" Triangle color :"+t1.getColor());
	System.out.println(" Triangle area :"+t1.area());
  }
}
 