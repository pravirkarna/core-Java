package readWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class readProperty {

	public static void main(String[] args) throws IOException {
		
		/*
		 * //First method FileReader reader = new
		 * FileReader(System.getProperty("user.dir")+"/Source/test.properties");
		 * 
		 * Properties prop = new Properties(); prop.load(reader);
		 * 
		 * String port =prop.getProperty("dbport"); System.out.println(port);
		 * 
		 * System.out.println(prop.getProperty("name"));
		 */
		
		Properties prop = new Properties();
		prop.setProperty("name", "Pravir");
		prop.store(new FileWriter(System.getProperty("user.dir")+"/Source/test.properties"), "Created on may30");

	}

}
