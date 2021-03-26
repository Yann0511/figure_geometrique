package Figures;

public class Rectangle implements Figure
{
     protected double a, b;

     public Rectangle(double a, double b)
     {
	  this.a = a;
	  this.b = b;
     }

     public double perimetre()
     {
	  return((a + b) * 2);
     }

     public double aire()
     {
	  return(a * b);
     }
}

