package com.annotations.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlavoredMilkTea 
{
	private String sugarLevel;
	private String size;
	private MilkTea milkTea;
	
	//Constructor Method
	@Autowired
	public FlavoredMilkTea(String sugarLevel, String size, MilkTea milkTea)
	{
		this.sugarLevel=sugarLevel;
		this.size=size;
		this.milkTea=milkTea;
	}
	
	public String toString()
	{
		String output = new String();
		
		output += "Sugar level: " + sugarLevel + "\n";
		output += "Size: " + size + "\n";
		output += milkTea.prepareIngredients() + "\n";
		output += milkTea.mix();
		
		return output;
	}

}
