import java.io.*;
import java.util.*;

abstract class Shape
{
  double x,y;
  Shape(double a,double b)
  {
    x=a;
    y=b;
  }
  abstract void printArea();
}
class Rectangle extends Shape
{
  Rectangle(double a,double b)
  {
    super(a,b);
  }
  void printArea()
  {
    System.out.println("Area is: "+(x*y));
  }
}
class Triangle extends Shape
{
  Triangle(double a,double b)
  {
    super(a,b);
  }
  void printArea()
  {
    System.out.println("Area is: "+(0.5*x*y));
  }
}
class Circle extends Shape
{
  Circle(double a,double b)
  {
    super(a,b);
  }
  void printArea()
  {
    System.out.println("Area is: "+(3.14*x*y));
  }
}
class Abstract_test
{
  public static void main(String args[])
  {
  Rectangle r1=new Rectangle(10,20);
  Triangle t1=new Triangle(2,2);
  Circle c1=new Circle(3,3);
  r1.printArea();
  t1.printArea();
  c1.printArea();
  }
}
