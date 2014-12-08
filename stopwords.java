package basic;

import java.util.*;
import java.io.*;

public class stopwords {
		Set setA;

		stopwords()
		{
			setA = new HashSet();
			
			try {
				
				Scanner FileToSet = new Scanner(new File("stopwords.txt"));
				
				while(FileToSet.hasNext())
				{
					String word = FileToSet.next();
					setA.add(word);
				}
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		void RemoveStopWords(String filename)
		{
			FileOutputStream out=null;
			try
			{
			
				Scanner fip1=new Scanner(new File(filename));
		        out = new FileOutputStream("NotStopWords.txt");
		          
		          while(fip1.hasNext())
			        {
			            int flag=1;
			            String s1=fip1.next();
			            s1=s1.toLowerCase();
			           
			            if(setA.contains(s1))
			               flag=0;
			                    
			         
			            if(flag!=0)
			            {
			                PrintStream p=new PrintStream(out);
			                p.println(s1);    
			            }                    
			        }
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("cannot read file");
				e.printStackTrace();
			}
			
		}
		
		public static void main(String args[])
		{
			stopwords obj = new stopwords();
			String str = "file1.txt";
			obj.RemoveStopWords(str);
		}
}
