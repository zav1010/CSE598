public class Rectangle extends Shape
{


   private int length, width;

   public Rectangle(int l , int w)
   {

	 super();
     length = l;
     width = w;



   }

   public void calcArea()
   {
        // area is inherited from the shape
        area = length * width;

   }

   public void calcPerimeter()
    {

        // perimeter is inherited from the shape
        perimeter = 2 * (length + width);

    }

    public String toString()
   {
		return "Shape you have selected is: Rectangle\n\n Length = " +length + "Width = " + width + super.toString();
   }


}