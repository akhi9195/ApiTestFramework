package com.github.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Common {
	
	
	public static Properties readPropertiesFile()  {
		String currentDir= System.getProperty("user.dir");
		//System.out.println("currentDir:"+currentDir);
		String fileName=currentDir+"/APITestFramework/target/config.properties";  
		//System.out.println("fileName:"+fileName);
		FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream("C:/Users/Akhil/eclips"
	         		+ "e-workspace/APITestFramework/target/config.properties");
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      return prop;
	   }

}
