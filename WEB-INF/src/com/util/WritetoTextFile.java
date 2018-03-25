package com.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;



public class WritetoTextFile 
{
	public static boolean writetotextfile(String root,String data) throws IOException
	{
		
		 File ff=new File(root);
	
		if (!ff.exists()) 
        {
          ff.mkdirs();
        }
   File f2=new File(root+"/"+"Review_Result_data.txt");
   
   if (!f2.exists()) 
        {
          f2.createNewFile();
        }
 	
  	
  	FileWriter fstream = new FileWriter(root+"/"+"Review_Result_data.txt", true);
    BufferedWriter out1 = new BufferedWriter(fstream);
   
    
    
  	
	out1.write(data);
	out1.newLine();
  	 out1.close();
  	
  	
  	
  	
  	
	return true;
   }
	
	
	
	
	
}
