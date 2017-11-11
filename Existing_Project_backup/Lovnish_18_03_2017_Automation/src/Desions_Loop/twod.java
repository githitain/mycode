package Desions_Loop;

class twod
{
	public static void main (String args [])
	{
		int twd[][]={{1,2,3,4},{2,4,5,1},{5,12,6,4}};
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.println(twd[i][j]);
			}
			System.out.println();
		}
	}
}