package rs.ac.ni.pmf.oop2.inheritance.classes;

public class B extends A
{
	public void inc(final int ammount)
	{
		setX(getX() + ammount);
//		this.x += ammount;
	}

	@Override
	public void inc()
	{
		System.out.println("B::inc()");
		inc(2);
	}
}
