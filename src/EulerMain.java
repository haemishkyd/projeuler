public class EulerMain
{

	public static void main(String[] args)
	{
		double returned_result;
		long start_time;
		long end_time;
		String double_string;
		String time_string;

		start_time = System.currentTimeMillis();
		returned_result = Problem3();
		end_time = System.currentTimeMillis();

		double_string = Double.toString(returned_result);
		time_string = Long.toString((long) (end_time - start_time));
		System.out.println("Result: " + double_string);
		System.out.println("Time: " + time_string);
	}

	public static double Problem3()
	{
		double temp_var;
		double result = 0;
		double final_val = (double) 600851475143L;

		for (temp_var = 0; temp_var < Math.sqrt(final_val); temp_var++)
		{
			if (isPrime(temp_var))
			{
				if (final_val % temp_var == 0)
				{
					if (temp_var > result)
					{
						result = temp_var;
					}
				}
			}
		}

		return result;
	}

	public static double Problem2()
	{
		double fibonacci_one = 1;
		double fibonacci_two = 2;
		double fibonacci_three = 0;
		double result = 2;

		do
		{
			fibonacci_three = fibonacci_two + fibonacci_one;
			System.out.println(fibonacci_three);
			if ((fibonacci_three % 2 == 0) && (fibonacci_three < 4000000))
			{
				result += fibonacci_three;
			}
			fibonacci_one = fibonacci_two;
			fibonacci_two = fibonacci_three;
		} while (fibonacci_three < 4000000);

		return result;
	}

	public static double Problem1()
	{
		int temp_var;
		double result = 0;

		for (temp_var = 0; temp_var < 1000; temp_var++)
		{
			if (temp_var % 3 == 0)
			{
				result += temp_var;
			} else if (temp_var % 5 == 0)
			{
				result += temp_var;
			}
		}
		return result;
	}

	private static boolean isPrime(double n)
	{
		int max_divisor;
		int divisor;

		if (n < 2)
			return false;
		if ((n == 2) || (n == 3))
			return true;
		if ((n % 2 == 0) || (n % 3 == 0))
			return false;
		max_divisor = (int) Math.sqrt(n); // square root of n
		divisor = 5;
		while (divisor <= max_divisor)
		{
			if ((n % divisor == 0) || (n % (divisor + 2) == 0))
			{
				return false;
			}
			divisor += 6;
		}
		return true;
	}

}
