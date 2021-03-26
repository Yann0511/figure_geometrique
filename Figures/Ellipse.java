package Figures;

public class Ellipse implements Figure
{
     protected double a, b;

     public Ellipse(double a, double b)
     {
	  this.a = a;
	  this.b = b;
     }

     public double perimetre()
     {
	  return(2 * Math.PI * Math.sqrt((a*a + b*b)/2));
     }

     public double aire()
     {
	  return(Math.PI * a * b);
     }
}
