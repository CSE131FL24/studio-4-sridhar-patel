package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color pissYellow = new Color(222,198,44);
		Color uglySeahawkGreen = new Color (0, 255, 68);
		Color normalPink = new Color(255, 0, 179);
		
		StdDraw.setPenColor(pissYellow); 
		StdDraw.filledRectangle(0, 1, 1, 1);
		
		StdDraw.setPenColor(uglySeahawkGreen); 
		StdDraw.filledCircle(0.5, 0.75, 0.1);
		
		StdDraw.setPenColor(normalPink);
		StdDraw.filledRectangle(0.5, 0.75, 0.05, 0.05);
		
		StdDraw.setPenColor(0,0,0);
		double [] x = {0.4, 0.5, 0.6};
		double [] y = {0.5, 0.6, 0.5};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(50,50,200);
		double [] a = {0.01, 0.2, 0.3, 0.4, 0.5, 0.55};
		double [] b = {0.6, 0.1, 0.2, 0.3, 0.4, 0.5}; 
		StdDraw.filledPolygon(a, b);

		
		
		
		
		
	}
}