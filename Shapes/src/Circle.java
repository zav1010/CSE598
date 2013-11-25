
//import java.text.DecimalFormat;
public class Circle extends Shape
{

	private int radius;
	private static final double PI= 3.142;


    public Circle(int cradius)
	{
		super();
		radius = cradius;

	}

	public Circle()
        {
		super();
		radius=0;

	}

	public void calcArea(){
		area = PI * radius*radius;
	}
	public void calcPerimeter(){
		perimeter = 2*PI*radius;
	}
	public String toString(){
		//DecimalFormat fmt = new DecimalFormat("0.##");
		return "Shape you have selected is: Circle\n\nSide Radius = " + radius + super.toString();
	}


}

