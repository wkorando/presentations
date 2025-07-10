package model;

public record Person(String firstName, String lastName){
	public String printName(){
		return lastName + ", " + firstName;
	}
}