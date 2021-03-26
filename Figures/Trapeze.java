package Figures;

public class Trapeze implements Figure 
{
     private double p_base, g_base, hauteur, c, d;

     public Trapeze(double p_base, double g_base, double hauteur, double c, double d)
     {
	  this.p_base = p_base;
	  this.g_base = g_base;
	  this.hauteur = hauteur;
	  this.c = c;
	  this.d = d;
     }

     public double perimetre()
     {
	  return(p_base + g_base + c + d);
     }

     public double aire()
    {
	 return(((p_base + g_base) * hauteur) / 2);
    }
}
