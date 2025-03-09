package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	public static String propertyData() throws IOException {
		
		FileInputStream fis = new FileInputStream("");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		return url;
	}
}
