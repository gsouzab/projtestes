package triangulo;
import java.util.*;

public class Triangle {

	public String makeTriangle(int a, int b, int c) {
		String type = null;

        if(a==b && b==c)
        	type = "Equilateral";

        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
            type ="Not a triangle";

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
        	type = "Isosceles";

        else if(a!=b && b!=c && c!=a)
        	type = "Scalene";
        
        return type;
	}
	
}
