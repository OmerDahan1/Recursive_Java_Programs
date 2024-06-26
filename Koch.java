/**
 * Draws the Koch curve and the the Koch snowflake fractal.
 */
public class Koch {

	public static void main(String[] args) {

		//// Uncomment the first code block to test the curve function.
		//// Uncomment the second code block to test the snowflake function.
		//// Uncomment only one block in each test, and remember to compile
		//// the class whenever you change the test.

		// Tests the curve function:
		// Gets n, x1, y1, x2, y2,
		// and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
		curve(Integer.parseInt(args[0]),
				Double.parseDouble(args[1]), Double.parseDouble(args[2]),
				Double.parseDouble(args[3]), Double.parseDouble(args[4]));



		// Tests the snowflake function:
		// Gets n, and draws a Koch snowflake of n edges in the standard canvass.
		snowFlake(Integer.parseInt(args[0]));

	}

	/**
	 * Gets n, x1, y1, x2, y2,
	 * and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
	 */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if (n == 0)
			return;
		StdDraw.line(x1, y1, x2, y2);
		double x3 = Math.sqrt(3) / 6 * (y1 - y2) + 0.5 * (x1 + x2);
		double y3 = Math.sqrt(3) / 6 * (x2 - x1) + 0.5 * (y1 + y2);
		double x4 = x1 + (x2 - x1) / 3;
		double y4 = y1 + (y2 - y1) / 3;
		double x5 = x1 + ((x2 - x1)* 2) / 3;
		double y5 = y1 + ((y2 - y1) * 2) / 3;
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.line(x4, y4, x5, y5);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(x4, y4, x3, y3);
		StdDraw.line(x3, y3, x5, y5);
		curve(n -1, x1, y1, x4, y4);
		curve(n - 1, x4, y4, x3, y3);
		curve(n - 1, x3, y3, x5, y5);
		curve(n - 1, x5, y5, x2, y2);
	}
	/**
	 * Gets n, and draws a Koch snowflake of n edges in the standard canvass.
	 */
	public static void snowFlake(int n) {
		double x1 = 0.2;
		double y1 = 0.9;
		double x2 = 0.9;
		double y2 = 0.9;
		double x3 =  x1 + (x2 - x1) / 2;
		double y3 = 1.1 -  Math.sqrt(3) * y1 / 2;
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0 ,1.1);
		// Draws a Koch snowflake of depth n
		curve(n, x1, y1, x2, y2);
		curve(n, x3, y3, x1, y1);
		curve(n, x2, y2, x3, y3);
	}
}
