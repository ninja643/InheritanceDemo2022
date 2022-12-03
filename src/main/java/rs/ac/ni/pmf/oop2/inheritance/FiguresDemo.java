package rs.ac.ni.pmf.oop2.inheritance;

import rs.ac.ni.pmf.oop2.inheritance.figures.*;

public class FiguresDemo
{
	private static void printFigureArea(final Figure figure)
	{
		System.out.println(figure.area());
	}

	private static void doTheMove(final Movable movable)
	{
		movable.move(1,0);
	}

	public static void main(String[] args)
	{
		final Rectangle rectangle = new Rectangle(5, 8);
		final Circle circle = new Circle(10);
		final Sphere sphere = new Sphere(10);

		printFigureArea(rectangle);
		printFigureArea(circle);
//		printFigureArea(sphere);

		doTheMove(circle);
		doTheMove(sphere);
//		doTheMove(rectangle);
	}

	public static void main1(String[] args)
	{
		final Rectangle rectangle = new Rectangle(5, 8);
		final Square square = new Square(6);

		System.out.println(rectangle.area());
		System.out.println(rectangle.circumference());

		System.out.println(square.area());
		System.out.println(square.circumference());
	}
}
