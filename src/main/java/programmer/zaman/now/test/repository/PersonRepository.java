package programmer.zaman.now.test.repository;

import programmer.zaman.now.test.data.Person;

public interface PersonRepository {

  Person selectById(String id);

  void insert(Person person);

}
