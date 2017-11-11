package S07_Session_JAVA_June_19th;

public class maxArray
	
{
	public static void main(String[] args) 
	  {
		  int maxmin[]={11,10,2,3,6,7,1,9,0};
		  
		  int min=maxmin[0];  // 11
		  int max=maxmin[0]; // 11
		  
		  int len = maxmin.length;
		  
		  for (int i=0;i<len;i++)
			  
		  {
			  if(max<maxmin[i])
			  {
						  max=maxmin[i];  	// max = 11 ; I= 11; max = 11
						  					// max = 11 ; I= 10; max = 11
					
			  }
			  else if(min>maxmin[i])
				  							// MIN = 11 ; I= 10; MIN = 10
				  								// MIN = 11 ; I=2; MIN = 2
				  								// MIN = 2 ; I=3; MIN = 2
				  								// MIN = 2 ; I=1; MIN = 1
												// MIN = 1 ; I=0; MIN =0
				  min=maxmin[i];
				
			  
			
		  }
		  
		 System.out.println("thx max value =" + max);
		  System.out.println("thx min value =" + min);
	  }
}
