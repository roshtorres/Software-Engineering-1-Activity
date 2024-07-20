package com.annotations.domain;
import org.springframework.stereotype.Component;

@Component
public class Taro implements MilkTea 
{

	public String prepareIngredients() 
	{
		return "Prepare taro, milk, tea!";
	}

	public String mix() 
	{
		return "Mix taro, milk, tea!";
	}

}
