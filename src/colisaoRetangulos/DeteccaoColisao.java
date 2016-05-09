package colisaoRetangulos;

public class DeteccaoColisao {

	int colisao(int x00, int y00, int x01, int y01, int x10, int y10, int x11,int y11)
	{
		//if (x01 < x10 || x11 < 00 || y01 < y10 || y11 < y00 || x00 > x11 || x10 > x01 || y00 > y11 || y10 > y01)
		    
		if (x01 < x10 || x11 < x00 || y00 < y11 || y11 < y00 || x00 > x11 || x10 > x01 || y01 > y11 || y10 > y01)
			return 0;
		else return 1;
	}	
}
