
public class NestedLoops {

	public static void main(String[] args) {


		/*
		 * 
		 * while --> 3
		 * for ---> 4
		 * do-while --> 5
		 * 
		 * 
		 * 
		 */
		
		int i=0; 
		int count=0;
		
		while(i<3)
		{
			for(int j=0; j<4; j++)
			{
				int k=0;
				do{
					System.out.println("i--->"+i+"  j--->"+j+"  k--->"+k);
					k++;
					count++;
				  }while(k<5);
				
			}
			i++;
		}
		
		System.out.println("Total count is : "+count);
		/*
		 * 0, 0, 0
		 * 0, 0, 1
		 * 0, 0, 2
		 * 0, 0, 3
		 * 0, 0, 4
		 * 0, 1, 0
		 * 0, 1, 1
		 * 0, 1, 2
		 * 0, 1, 3
		 * 0, 1, 4
		 * 0, 3, 4
		 * 1, 0, 0
		 */

	}

}
