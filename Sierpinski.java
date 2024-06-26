import java.awt.*;

/** Prints ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double s = Math.sqrt(3) / 2;
		sierpinski (n, 0, 1, 0.5 ,0, 0, s);
	}
	
	public static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if(n == 0){
			return;
		}
			StdDraw.setPenColor(Color.black);
			StdDraw.line(x1, y1, x2, y2);
			StdDraw.setPenColor(Color.yellow);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.setPenColor(Color.blue);
			StdDraw.line(x3, y3, x1, y1);

				double halfLineX1 = (x1 + x2) / 2;
				double halfLineX2 = (x2 + x3) / 2;
				double halfLineX3 = (x3 + x1) / 2;
				double halfLiney1 = (y1 + y2) / 2;
				double halfLiney2 = (y2 + y3) / 2;
				double halfLiney3 = (y3 + y1) / 2;
				sierpinski(n - 1, x1, halfLineX1, halfLineX3, y1, halfLiney1, halfLiney3);
				sierpinski(n - 1, halfLineX1, x2, halfLineX2, halfLiney1, y2, halfLiney2);
				sierpinski(n - 1, halfLineX3, halfLineX2, x3, halfLiney3, halfLiney2, y3);
	}
}
