package IfElseCondition;

public class NestedIfElse 
{
	public  static void main(String [] args) 
{
	
	int day=8;
	if(day==1) 
	{
		System.out.println("SUNDAY");
	}
	else if(day==2)
	{
		System.out.println("MONDAY");
		
	}
	else if(day==3)
	{
		System.out.println("TUESDAY");
	}
	else if(day==4)
	{
		System.out.println("WEDNESDAY");
	}
	else if(day==5)
	{
		System.out.println("THURSDAY");
	}
	else if(day==6)
	{
		System.out.println("FRIDAY");
	}
	else if(day==7)
	{
		System.out.println("SATURDAY");
	}
	else
	{
		System.out.println("Invalid week number");
	}
}
}

