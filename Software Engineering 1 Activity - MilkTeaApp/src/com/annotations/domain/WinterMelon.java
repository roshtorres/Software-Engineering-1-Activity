package com.annotations.domain;
import org.springframework.stereotype.Component;

@Component
public class WinterMelon implements MilkTea 
{

	public String prepareIngredients() 
	{
		return "Prepare kundol, milk, tea!";
	}

	public String mix() 
	{
		return "Mix kundol, milk, tea!";
	}

}
