package com.crm.proearn.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author sanjay
 *
 */
public class FileUtility implements IConstantUtility{

	/**
	 * its used to read the data from commonData.properties File based on Key which you pass as an argument
	 * @param key
	 * @throws Throwable 
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(PROPERTYFILE);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;

	}

}
