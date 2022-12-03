package rs.ac.ni.pmf.oop2.inheritance.figures;

public class Sphere implements Figure3D
{
	private double radius;

	public Sphere(final double radius)
	{
		this.radius = radius;
	}

	@Override
	public double volume()
	{
		return 4.0 * Math.pow(radius, 3) * Math.PI / 3.0;
	}

	@Override
	public void move(final int x, final int y)
	{
		System.out.printf("Moving sphere for vector (%d, %d)\n", x, y);
	}
}
