package datastructures;

import java.util.ArrayList;

public class Lists 
{

	public static void main(String[] args) 
	{
		//Create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		//Add some elements
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Miami");
		cities.add("Green Bay");
		
		//Iterate through the collection
		for(String city : cities)
		{
			System.out.println(city);
		}
		
		//Get the size
		int size = cities.size();
		System.out.println("There are " + size + " elements in the collection");
		
		//Retrieve specific elements
		System.out.println(cities.get(0));
		
		//Remove elements
		cities.remove(0);
		size = cities.size();
		System.out.println("Now there are " + size + " elements in the collection");
		for(String city : cities)
		{
			System.out.println(city);
		}
	}

}
