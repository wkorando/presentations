import model.Person;
import service.PersonService;

public class Main{
	void main(){
		PersonService service = new PersonService();
		
		Person person = service.createNewPerson();
		
		IO.println(person.printName() + " has been created!");
	}

}