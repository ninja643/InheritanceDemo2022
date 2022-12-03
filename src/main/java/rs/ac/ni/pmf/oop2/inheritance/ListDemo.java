package rs.ac.ni.pmf.oop2.inheritance;

import java.util.*;

public class ListDemo
{
	private static int countEven(final List<Integer> values)
	{
		int count = 0;

		for (final Integer value : values)
		{
			if (value % 2 == 0)
			{
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		final List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);

		System.out.println(countEven(list));
	}
}
