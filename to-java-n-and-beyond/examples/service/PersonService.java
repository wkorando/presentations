package service;

import model.Person;

public class PersonService{
	public Person createNewPerson(){
		String firstName = readField("First name");
		String lastName = readField("Last name");
		
		return new Person(firstName, lastName);
	}
	
	public String readField(String fieldName){
		String userInput = IO.readln("Enter a " + fieldName + ": ");
		if(userInput.isEmpty() || userInput.isBlank()){
			IO.println(fieldName + " is blank, please enter a valid " + fieldName + "!");
			userInput =  readField(fieldName);
		}
		return userInput;
	}
}