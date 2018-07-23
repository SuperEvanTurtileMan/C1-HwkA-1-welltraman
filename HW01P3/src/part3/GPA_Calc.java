package part3;

public class GPA_Calc
{
	int[] percentageList 	= {  50,   53,   57,   60,   63,   67,   70,   73,   77,   80,   85,  101};
	float[] gpaList 		= {0.0f, 0.7f, 1.0f, 1.3f, 1.7f, 2.0f, 2.3f, 2.7f, 3.0f, 3.3f, 3.7f, 4.0f};
	
	public float percent_to_gpa(int percentage)
	{
		if (percentage > 100 || percentage < 0) return -1;
		
		float gpa = 0.0f;
		
		for (int i = 0; i < percentageList.length; i++)
		{
			if (percentage < percentageList[i])
			{
				gpa = gpaList[i];
				break;
			}
		}
		
		return gpa;
	}
}
