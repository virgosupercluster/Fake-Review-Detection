package com.util;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopUpload 
{

	public static boolean  uploadtohadoop(String configpath,String uploadfilepath)
	{
		boolean flag=false;
		 //======================Hadoop Storage starts============================
        
        try
		{
		 String filePath=configpath;

			
			System.out.println("filepath upload is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+filePath);
			FileInputStream fileInputStream = new FileInputStream(new File(
					filePath));
			Properties properties = new Properties();
			properties.load(fileInputStream);

			Configuration conf = new Configuration();
			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
			FileSystem fs = FileSystem.get(conf);
			Path pt = new Path(properties.getProperty("hdfsLoc"));

			Path src = new Path(uploadfilepath+"/"+"Review_Result_data.txt");
			
		
			fs.copyFromLocalFile(src, pt);
			flag=true;
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			flag=false;
		}
        
        //======================Hadoop Storage ends============================
		
		
		
		
		
		
		return flag;
		
	}
	
	
}
