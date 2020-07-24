package BusinessLayer;

import DataLayer.Database;

public class Multiplication
{
	public int multiplication(int first, int second) 
	{

        Database a=new Database();
		int output=first*second;
		a.data(first, second, "MULTIPLICATION", output);
		return output;
	}
}
