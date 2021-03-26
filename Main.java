import Figures.*;
import java.math.*;
import java.util.*;

public class Main
{
     public static void main(String[] args)
     {
	  Triangle a = new Triangle(2, Math.sqrt(3), 2, 2);
	  Carre b = new Carre(2);
	  Rectangle c = new Rectangle(4, 2);
	  Ellipse d = new Ellipse(6, 3);
	  Cercle e = new Cercle(3);
	  Trapeze f = new Trapeze(2, 5, 3, Math.sqrt(13), Math.sqrt(13));

	  System.out.printf("\n\n Le perimetre et l'aire du triangle est respectivement : %f et %f", a.perimetre(), a.aire());
	  System.out.printf("\n\n Le perimetre et l'aire du Carré est respectivement : %f et %f", b.perimetre(), b.aire());
	  System.out.printf("\n\n Le perimetre et l'aire du Rectangle est respectivement : %f et %f", c.perimetre(), c.aire());
	  System.out.printf("\n\n Le perimetre et l'aire du Ellipse est respectivement : %f et %f", d.perimetre(), d.aire());
	  System.out.printf("\n\n Le perimetre et l'aire du Cercle est respectivement : %f et %f", e.perimetre(), e.aire());
	  System.out.printf("\n\n Le perimetre et l'aire du Trapeze est respectivement : %f et %f", f.perimetre(), f.aire());
	  
     }
}
