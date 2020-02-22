package propertiesvjit;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PersonProperties {
	
	
	public static void main(String[] args) throws IOException
	{
		Properties pp=new Properties();
		FileReader fr=new FileReader("C:\\Users\\HP\\eclipse-workspace\\Properties\\src\\PersonProps.properties");
	System.out.println("After Loading");
	
	pp.load(fr);
	System.out.println(pp);
	System.out.println("using getProperty() method");
	System.out.println(pp.getProperty("name"));
	System.out.println(pp.getProperty("r.no"));
	fr.close();
}
	}
