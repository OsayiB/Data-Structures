package datastructures;

public class Arrays 
{

	public static void main(String[] args) 
	{
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
		
		System.out.println("The old fashion way");
		for(int i=0; i < 5; i++)
		{
			System.out.print(alphabet[i] + " ");
		}
		
		int size = alphabet.length;
		System.out.println("\n\nUsing the length variable");
		for(int i=0; i < size; i++)
		{
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println("\n\nUsing For Each method");
		for(String letter : alphabet)
		{
			System.out.print(letter + " ");
		}
		
		System.out.println("\n\nDouble Arrays");
		
		String[][] users = {
							{"John", "Williams", "jw@testemail.com", "5107658234"},
				           {"Sarah", "Jackson", "sj@testemail.com", "5102345234"},
				           {"Rachel", "Wallace", "rc@testemail.com", "5102385674"} 
						};
		
		//Get the size array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		//Traverse the array
		for(int i=0; i<numOfUsers; i++)
		{
			for(int j=0;j<numOfFields;j++)
			{
				System.out.println(users[i][j]);
				
			}
			
		}
		
		//Traverse double array
		System.out.println("\n\nUsing FOR EACH");
		for(String[] user : users)
		{
			System.out.print("[ ");
			for(String field : user)
			{
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
			
		
		

	}

}
