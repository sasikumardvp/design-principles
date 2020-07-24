package BusinessLayer;

import DataLayer.Database;

public class Divide {
	public int division(int first, int second)
	{
		
		Database a=new Database();	
		int output=first/second;
		a.data(first, second, "DIVISION", output);
		return output;
	}

}
