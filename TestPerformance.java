import java.util.*;
public class TestPerformance
{
	
	public static void print(List <Integer>list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.print("\t"+list.get(i));
		}
	}
	public static void fill(List <Integer>list)
	{
		for(int i=0;i<=50000;i++)
		{
			list.add(i);
		}
		
	}
	public static void main(String args[])
	{
		//array Collection	
			ArrayList<Integer> AList =new ArrayList<Integer>();
			long startTime=System.currentTimeMillis();
		
			fill(AList);
			print(AList);
			
			long stopTime=System.currentTimeMillis();
			long elepsedTimeForArray=stopTime-startTime;
			
		//linklist Collection
			LinkedList<Integer> lList=new LinkedList<Integer>(); 
			
			startTime=System.currentTimeMillis();
			fill(lList);
			print(lList);
			stopTime=System.currentTimeMillis();
			
			long elepsedTimeForLinkList=stopTime-startTime;
			
			System.out.println("\nTotal Execution time For ArrayCollection is :"+elepsedTimeForArray+"\n"+"Total Execution time For LinkList Collection is :"+elepsedTimeForLinkList);
		
		
	}
	
}
/*
==========================================================================
					output
=========================================================================
Total Execution time For ArrayCollection is :4883
Total Execution time For LinkList Collection is :9235*/