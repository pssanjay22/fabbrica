package com.crm.proearn.genericutility;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author sanjay
 *
 */
public class JavaUtility {
	/**
	 * it's used to generate random number
	 * @return int data
	 */
	public int getRandomNumber()
	{
		Random random=new Random();
		int intRandom = random.nextInt(1000);
		return intRandom;
	}
	/**
	 * used to get system date and time in IST format
	 * @return
	 */
	public String getSystemDateAndTime()
	{
		Date date=new Date();
		return date.toString();
	}
	/**
	 * used to get system date in YYYY-MM-DD format
	 * @return
	 */
	public String getSystemDateWithFormate()
	{
		Date date=new Date();
		String dateandtime = date.toString();
		String YYYY = dateandtime.split(" ")[5];
		String DD = dateandtime.split(" ")[2];
		int MM = date.getMonth()+1;

		String finalFormate= YYYY+"-"+MM+"-"+DD;
		return finalFormate;
	}
}