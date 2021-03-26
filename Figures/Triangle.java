package Figures;

public class Triangle implements Figure
{
     private double base, hauteur, a, b;

     public Triangle(double base, double hauteur, double a, double b)
     {
	  this.base = base;
	  this.hauteur = hauteur;
	  this.a = a;
	  this.b = b;
     }

     public double perimetre()
     {
	  return(this.a + this.b + this.base);
     }

     public double aire()
     {
	  return((this.base * this.hauteur) / 2);
     }
}
