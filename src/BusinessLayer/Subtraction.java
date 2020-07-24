package BusinessLayer;

import DataLayer.Database;

public class Subtraction {

	public int subtraction(int first, int second) 
	{
		Database a=new Database();
		int output=first-second;
		a.data(first, second, "SUBTRACTION", output);
		return output;
	}
}
