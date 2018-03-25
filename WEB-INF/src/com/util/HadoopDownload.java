package com.util;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


public class HadoopDownload 
{
	public static boolean  downloadfromhadoop(String configpath,String filename,String DownloadPath)
	{
		boolean flag=false;
		try
		{

			String filePath = null;
			
			filePath = configpath;
			/*System.out.println("fielpath is download >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+filePath);
			FileInputStream fileInputStream = new FileInputStream(new File(
					filePath));
			Properties properties = new Properties();
			properties.load(fileInputStream);

			Configuration conf = new Configuration();
			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
			FileSystem fs = FileSystem.get(conf);
			Path pt = new Path(properties.getProperty("hdfsLoc")+"/"+filename);

			Path src = new Path(DownloadPath+filename);
			fs.copyToLocalFile(pt, src);
			flag=true;
			*/
			
			
			
			
			
			
			
			
			
			
			FileInputStream fileInputStream = new FileInputStream(new File(
					filePath));
			Properties properties = new Properties();
			properties.load(fileInputStream);

			Configuration conf = new Configuration();
			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
			FileSystem fs = FileSystem.get(conf);
			//Path pt = new Path(properties.getProperty("hdfsLoc")+"/blockname");
			Path pt = new Path(properties.getProperty("hdfsLoc")+"/"+filename);
			//Path src = new Path(configpath+blockname);
			//Path src = new Path(configpath + "/shanuuuu.txt");
			Path src = new Path(DownloadPath + "/"+filename);
			
			
			fs.copyToLocalFile(pt, src);
			
			
			
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;

	
	}

}
