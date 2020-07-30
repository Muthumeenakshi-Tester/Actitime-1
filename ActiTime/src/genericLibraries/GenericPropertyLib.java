package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericPropertyLib {
	
	public static String getValue(String path, String key)
	{
		String value="";
		try {
			FileInputStream fin =new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fin);
			value=prop.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}

}
