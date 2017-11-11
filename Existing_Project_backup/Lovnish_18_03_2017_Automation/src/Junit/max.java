package Junit;

import java.util.StringTokenizer;

public class max 
{
	public static int findMax(int arr[])
	{
		int max=0;
		for (int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static int findcube(int n)
	{
			return n*n*n;
	}
	
	public static String findreverse(String str)
	{
		StringBuilder rs = new StringBuilder();
		StringTokenizer tok=new StringTokenizer (str,"");
		while(tok.hasMoreTokens())
		{
			StringBuilder sb = new StringBuilder();
			sb.append(tok.nextToken());
			sb.reverse();
			rs.append(sb);
			rs.append("");
		}
		return rs.toString();
	}
		
}
