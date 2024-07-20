package com.annotations.app;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.annotations.domain.FlavoredMilkTea;

public class MilkTeaApp 
{
	public static void main(String[] args)
	{
		//Open the application context xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");	
		
		//Read the bean
		FlavoredMilkTea fmt = context.getBean("flavoredMilkTea", FlavoredMilkTea.class);
		
		//Print the milk tea
		System.out.println(fmt);
		
		//Close the context
		context.close();
	
	
	}

}
