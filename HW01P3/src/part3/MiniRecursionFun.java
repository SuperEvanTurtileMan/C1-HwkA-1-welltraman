package part3;

public class MiniRecursionFun
{
	public int numericalRecursion(int input)
	{
		if (input > 100) return input;
		if ((input % 3) == 0) return numericalRecursion(input + 2);
		if ((input % 2) == 0) return numericalRecursion(input * 2);
		return 0;
	}
}
