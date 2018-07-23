package part3;

public class StringRepr
{
	public String my_str(Object input)
	{
		if (input instanceof String) return (String)input;
		else if (input instanceof Boolean)
		{
			if ((Boolean)input) return "YES";
			else return "NO";
		}
		else if (input instanceof Integer)
		{
			if ((Integer)input < 0) return "Negative Number";
			else if ((Integer)input < 11) return "Small Number";
			else if ((Integer)input < 100) return "Medium Number";
			else return "Large Number";
		}
		else return "I dunno what this is.";
	}
}
