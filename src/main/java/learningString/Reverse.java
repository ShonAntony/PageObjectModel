package learningString;


public class Reverse {

	 {
		  String name = "hello";
		  
		  int len;
		        len= name.length();
		        char arr[]=new char[len];
		        for(int i=0;i<len;i++)
		        {
		         
		         arr[i]=name.charAt(i);
		        }
		        for(int i=len-1;i>=0;i--)
		        {
		         System.out.print(arr[i]);
		        }
		 }
	
}
