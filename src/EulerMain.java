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
		returned_result = Problem9();
		end_time = System.currentTimeMillis();

		double_string = Double.toString(returned_result);
		time_string = Long.toString((long) (end_time - start_time));
		System.out.println("Result: " + double_string);
		System.out.println("Time: " + time_string);
	}
	
	public static double Problem9()
	{
		double result = 0;
		double last_answer = 0;
		double inner_answer = 0;
		int outer,inner;
		
		outer = 0;
		inner = 0;
		
		outerloop:
		for (outer =1;outer<1000;outer++)
		{
			for (inner =1;inner<1000;inner++)
			{
				inner_answer = Math.pow(outer, 2) + Math.pow(inner, 2);
				if ((int) Math.sqrt(inner_answer) == Math.sqrt(inner_answer))
				{
					last_answer = Math.sqrt(inner_answer) + outer + inner;
					if (last_answer == 1000)
					{
						break outerloop;
					}
				}
			}
		}
		System.out.println(Math.sqrt(inner_answer)+" "+ outer+" "+ inner);
		result = Math.sqrt(inner_answer) * outer * inner;
		return result;
	}
	
	public static double Problem8()
	{
		double result = 0;
		double temp_result = 0;
		double extracted_val = 0;
		String thou_dig_num;
		int get_val_counter = 0;
		int string_counter = 0;		
		
		thou_dig_num = new String("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450");
		System.out.println("Length: " +thou_dig_num.length());
		
		while (string_counter <= 995)
		{
			temp_result = (double)(thou_dig_num.charAt(string_counter)-'0');;
			for (get_val_counter = 1;get_val_counter<5;get_val_counter++)
			{
				extracted_val = (double)(thou_dig_num.charAt(string_counter+get_val_counter)-'0');				
				temp_result *= extracted_val;				
			}		
			if (temp_result > result)
			{
				result = temp_result;
			}
			string_counter++;
		}
		
		return result;
	}
	
	public static double Problem7()
	{
		double result = 0;
		double counter = 0;
		double primer_counter = 0;
		
		while (primer_counter < 10001)
		{
			counter++;
			if (isPrime(counter))
			{
				primer_counter++;
			}			
		}
		
		result = counter;
		return result;
	}

	public static double Problem6()
	{
		double result = 0;
		double counter = 0;
		double sum_square = 0;
		double square_sum = 0;;
		
		for (counter=1; counter <=100;counter++)
		{
			sum_square += Math.pow(counter, 2);
			square_sum += counter;
		}
		
		System.out.println("Sum Square: " + sum_square);
		System.out.println("Square Sum: " + Math.pow(square_sum, 2));
		
		result = Math.pow(square_sum, 2) - sum_square;
		
		return result;
	}
	
	public static double Problem5()
	{
		double result = 0;
		boolean answer_found = false;
		double try_this = 0;

		/* Assume that the starting point has to be 20*19 since 19 is prime */
		result = 20 * 19;
		while (!answer_found)
		{
			result++;
			for (try_this = 2; try_this < 21; try_this++)
			{
				if ((result % try_this) == 0.0)
				{
					answer_found = true;
				} else
				{
					answer_found = false;
					break;
				}
			}
		}
		return result;
	}
	
	public static double Problem4()
	{
		double result = 0;
		double inner = 0;
		double outer = 0;
		double mult_answer;

		for (outer = 999; outer >= 100; outer--)
		{
			for (inner = 999; inner >= 100; inner--)
			{
				mult_answer = inner * outer;
				if (isPalindrome(mult_answer))
				{					
					if (mult_answer > result)
					{
						System.out.println(inner);
						System.out.println(outer);
						result = mult_answer;
					}
				}				
			}			
		}

		return result;
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
	
	private static boolean isPalindrome(double num)
	{
		int n;
		int rev;
		int dig;
		int input_num;
		
		input_num = (int)num;

		n = input_num;
		rev = 0;
		while (input_num > 0)
		{
			dig = input_num%10;			
			rev = rev * 10 + dig;
			input_num = input_num / 10;
		}

		if (n == rev)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
