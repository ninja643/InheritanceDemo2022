package rs.ac.ni.pmf.oop2.inheritance.figures;

public class Rectangle implements Figure
{
	double a;
	double b;

	public Rectangle(final double a, final double b)
	{
		this.a = a;
		this.b = b;
	}

	public double getA()
	{
		return a;
	}

	public double getB()
	{
		return b;
	}

	@Override
	public double area()
	{
		return a * b;
	}

	@Override
	public double circumference()
	{
		return 2 * (a + b);
	}
}
