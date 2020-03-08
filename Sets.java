package datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets 
{

	public static void main(String[] args) 
	{
		//LinkedHash - in order that they were entered
		//HashSet - complete random order
		//TreeSet - rearranges to natural order
		//1. Define the collection
		Set<String> animals = new HashSet<String>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("mamba");
		animals.add("hog");
		animals.add("pig");
		
		System.out.println("These are the animals: " + animals);
		
		animals.add("hog");
		animals.add("dog");
		animals.add("goose");
		//System.out.println(animals);
		
		//Create new set for comparison
		Set<String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("chicken");
		farmAnimals.add("dog");
		farmAnimals.add("horse");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		System.out.println("These are the farm animals: " + farmAnimals);
		
		//Intersection of the sets
		//Create a new set of the existing one
		
		Set<String> intersectionSet = new HashSet<String>(animals);
		//RETAIN only the same elements in each set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		//UNION
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union set is: " + unionSet);
		
		//DIFFERENCE
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference set is: " + differenceSet);
		
	

	}

}
