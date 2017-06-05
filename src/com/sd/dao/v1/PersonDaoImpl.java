package com.sd.dao.v1;
import java.util.List;
import java.util.ArrayList;

public class PersonDaoImpl implements PersonDao {
  List<Person> persons;
  public PersonDaoImpl() {
    //List<Person> persons=new ArrayList<Person>();
    persons=new ArrayList<Person>();
    Person p1 = new Person(0,"v1-0");
    Person p2 = new Person(1,"v1-1");
    persons.add(p1);
    persons.add(p2);
  }
  public List<Person> getAllPersons() {
    return persons;
  }
  public Person getPerson(int id) {
    return persons.get(id);
  }
  public void updatePerson(Person p) {
    persons.get(p.getId()).setName(p.getName());
  }
  public void deletePerson(Person p) {
    persons.remove(p.getId());
  }
}