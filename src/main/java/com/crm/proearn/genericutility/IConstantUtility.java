package com.crm.proearn.genericutility;
/**
 * 
 * @author sanjay
 *
 */
public interface IConstantUtility {
/**
 * To get the path of url,un,pwd from Excelsheet and Propertyfile
 * @param EXCELPATH
 * @param PROPERTYFILE
 * @param JDBC_URL_STRING
 * @param JDBC_USERNAME
 * @param JDBC_PASSWORD
 * @param IMPLICITILY_TIMEOUT
 * @param EXPLICITILY_TIMEOUT
 */
	String EXCELPATH="./testdata/Exceldata.xlsx";
	String PROPERTYFILE="./testdata/commondata.properties";
	String JDBC_URL_STRING="jdbc:mysql://localhost:3306/students";
	String JDBC_USERNAME="root";
	String JDBC_PASSWORD="root";
	int IMPLICITILY_TIMEOUT=30;
	int EXPLICITILY_TIMEOUT=20;
}
