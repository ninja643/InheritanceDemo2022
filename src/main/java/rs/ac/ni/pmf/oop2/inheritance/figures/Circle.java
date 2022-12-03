package rs.ac.ni.pmf.oop2.inheritance.figures;

public class Circle implements Figure, Movable
{
	int centerX;
	int centerY;
	double radius;

	public Circle(final double radius)
	{
		this.radius = radius;
	}

	@Override
	public double area()
	{
		return radius * radius * Math.PI;
	}

	@Override
	public double circumference()
	{
		return 2 * radius * Math.PI;
	}

	@Override
	public void move(final int x, final int y)
	{
		centerX += x;
		centerY += y;
		System.out.printf("Moving circle to (%d, %d)\n", centerX, centerY);
	}
}
