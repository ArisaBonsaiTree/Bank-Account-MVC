package av.BankAccount.dao;

import av.BankAccount.dto.Account;
import av.BankAccount.dto.Person;

import java.util.ArrayList;
import java.util.List;

public interface BankAccountDao {

    Person addPerson(Person person);

    List<Person> getAllPerson();

    Person getPerson(String firstName);

    Person removePerson(String firstName);

    Account makeAccount(Person person);

    Account deposit(Person person);

    Account withdraw(Person person);
}
