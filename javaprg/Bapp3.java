import java.util.Scanner;
class Building{
	private double hei,wid; 
	private int noofroom;
	private String owner;
	/*void setBuilding(double height,double width,String owner,int num)
	{
		 hei = height;
		 wid =width;
		 this.owner = owner;
		 noofroom=num;
		 
	}*/
	void setHeight(double height)
	{
		hei=height;
	}
	double  getHeight()
	{
		return hei;
	}void setWidth(double width)
	{
		wid=width;
	}
	double  getWidth()
	{
		return wid;
	}
	void setOwner(String owner)
	{
		this.owner = owner;
	}
	String  getOwner()
	{
		return owner;
	}
	void setRoom(int num)
	{
	  noofroom=num;
	}
	int  getRoom()
	{
		return noofroom;
	}
	
	/*void display()
	{
		 System.out.println("info of buiding : "+ hei+" "+wid+" "+noofroom+" "+owner);
	}*/
}
class Bapp3{
   public static void main(String args[])
   {
    Building building3 = new Building();
	building3.setHeight(300.89);
	building3.setWidth(345.78);
	building3.setOwner("sriram");
	building3.setRoom(6);
	System.err.println("info of buiding : \n Heigth      :"+building3.getHeight()+"\n Width       :"+building3.getWidth()+"\n no of rooms :"+building3.getRoom()+"\n Owner name  :"+building3.getOwner());
    /*building1.setBuilding(123,12,"sriram",54);
    building1.display();*/
   }
}   