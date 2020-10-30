package programmer.zaman.now.test.service;

import programmer.zaman.now.test.data.Person;
import programmer.zaman.now.test.repository.PersonRepository;

import java.util.UUID;

public class PersonService {

  private PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public Person get(String id) {
    Person person = personRepository.selectById(id);
    if (person != null) {
      return person;
    } else {
      throw new IllegalArgumentException("Person not found");
    }
  }

  public Person register(String name){
    var person = new Person(UUID.randomUUID().toString(), name);
    personRepository.insert(person);
    return person;
  }
}
