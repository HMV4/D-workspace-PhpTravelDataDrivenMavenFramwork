import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hdf.model.hdftypes.FileInformationBlock;


public class GenericUtility {

	public static String getEnvionmentValue(String VariableName) throws IOException
	{
		File f=new File("src/EnvionmentSetting/config");
		FileInputStream fis=new FileInputStream(f);
		
		Properties p=new Properties();
		p.load(fis);
		
		return (String) p.get(VariableName);
	}
}
