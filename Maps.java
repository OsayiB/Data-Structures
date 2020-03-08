package datastructures;

import java.util.HashMap;

public class Maps 
{

	public static void main(String[] args) 
	{
		//Implement map interface
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();	
		mapUtil(hMap);
		

	}
	
	public static void mapUtil(HashMap<Integer, String> map)
	{
		//Do Key value pairs
		map.put(101, "Shawn");
		map.put(123, "Holly");
		map.put(346, "Michael");
		map.put(45, "Kelly");
		map.put(24, "Kobe");
		
		System.out.println("See all of the keys " + map.keySet());
		System.out.println("See all of the key value pairs: " + map);
		System.out.println(map.get(45));
		
		for(int key : map.keySet())
		{
			System.out.println("[ KEY: " + key + ".  VALUE: " + map.get(key) + "]");
		}
		
		
	}

}
