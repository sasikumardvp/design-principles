package BusinessLayer;

import DataLayer.Database;

public class Addition {

	public int addition(int first, int second) 
	{
		Database a=new Database();
		int output=first+second;
		a.data(first, second, "ADDITION", output);
		return output;
	}
}
