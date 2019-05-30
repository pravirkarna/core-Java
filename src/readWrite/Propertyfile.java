package readWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Propertyfile {

	public static void main(String[] args) throws IOException {
		
		//Second Method to retrieve data from property file
		
		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir")+"/Source/test.properties");
		
			Properties prop = new Properties();
			
			//load a file
			prop.load(input);
			
			//fetch the value
			System.out.println(prop.getProperty("name"));
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}
		
		
		
		
			
		
	
	}
			
	

}
