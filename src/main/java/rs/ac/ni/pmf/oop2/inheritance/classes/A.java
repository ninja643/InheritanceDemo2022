package rs.ac.ni.pmf.oop2.inheritance.classes;

public class A
{
	private int x;
//	protected int x;

	public int getX()
	{
		return x;
	}

	public void setX(final int x)
	{
		if (x < 0)
		{
			System.out.println("Error, value less than 0");
		}
		this.x = x;
	}

	public void inc()
	{
		System.out.println("A::inc()");
		this.x++;
	}
}
