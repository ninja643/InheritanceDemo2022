package rs.ac.ni.pmf.oop2.inheritance;

import rs.ac.ni.pmf.oop2.inheritance.classes.*;

public class InheritanceDemo
{
	private static void info(final A a)
	{
		a.setX(1);
		System.out.println("A: " + a.getX());
		a.inc();
		System.out.println("A: " + a.getX());
	}

	private static void infoExtended(final B b)
	{
		info(b);

		b.inc(5);
		System.out.println("B: " + b.getX());
	}

	private static void infoGeneral(final A parameter)
	{
//		infoExtended((B)parameter); // Opasno!!!
		if (parameter instanceof B)
		{
			infoExtended((B)parameter);
			return;
		}

		info(parameter);
	}

	public static void main(String[] args)
	{
//		final A a = new A();
//		info(a);
//		infoGeneral(a);

//		final B b = new B();
//		info(b);
//		infoExtended(b);
//		infoGeneral(b);

		final C c = new C();
		c.inc3();
	}
}
