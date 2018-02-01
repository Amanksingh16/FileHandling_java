import java.io.*;
public class FileClass {

	public static void main(String[] args) throws IOException
	{
          File file = new File("C:\\Users\\Aman Singh\\Desktop\\Java Assignments GITHUB\\Assignment - 6\\abc.txt");
          
          FileReader in = null;        
          try {
			in = new FileReader(file);
			
			int c;
			while((c=in.read())!=-1)
					{
				        System.out.print((char)c);
					}		
          }
          catch (FileNotFoundException e) 
          {		
			System.out.println("File not found !");
		}
          finally {
        	  if(in!=null)
        	  {
        		  in.close();
        	  }
          }
          
        	  
          }
	
}
