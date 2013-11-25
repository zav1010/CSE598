import java.util.Scanner;

public class usingShapes{


public static void main(String []args)
{

   int length, width, radius;
   int selection =0;
   String more;


   Scanner scan = new Scanner(System.in);
 do
 {
 // To do : implement the program menu shown above  here
 System.out.println("\t\t Area/Perimeter Calculator");
 System.out.println("\t\t\t  1. Rectangle");
 System.out.println("\t\t\t  2. Square");
 System.out.println("\t\t\t  3. Circle");
 System.out.println("\t\t\t  4. Exit Program");
 System.out.print("\t\t Please select the option [1, 2, 3, 4]:");

 selection= scan.nextInt();

 switch (selection)
 {

 case 1:
    System.out.println("enter length:");
    length= scan.nextInt();
    System.out.println("enter width:");
    width = scan.nextInt();
    Rectangle  r = new Rectangle(length, width);
    //r.calcArea();
    //r.calcPerimeter();

    System.out.println(r);
    break;

 case 2:

    System.out.println("enter the side length:");
    length= scan.nextInt();
    Square  s = new Square(length);
    s.calcArea();
    s.calcPerimeter();
    System.out.println(s);
    break;

 case 3:

    System.out.println("enter the radius:");
    radius = scan.nextInt();
    Circle  c = new Circle(radius);
    c.calcArea();
    c.calcPerimeter();
    System.out.println(c);
    break;

 case 4:

   System.out.println("excisting the program!");
   break;

  default:

   System.out.println(" invalid input! exciting from the program");

 }

 System.out.println("More shapes? (Y/N)");
 scan.nextLine();
 more= scan.nextLine();
}while(more.charAt(0) == 'Y');




}

}