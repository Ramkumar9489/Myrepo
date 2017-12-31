import java.io.ObjectInputStream.GetField;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestDemo {
	
	
	
	
	
	@Test(dataProvider="getData")
	public void loginTest(String d1,String d2,String d3)
	{
		
	}

	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];

		data[0][0]="UI";
		data[0][1]="PI";
		data[0][2]="Chrome";
		
		data[1][0]="UI";
		data[1][1]="P1";
		data[1][2]="Ie";
		
		return data;
		
	}
}
