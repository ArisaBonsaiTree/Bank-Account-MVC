package av.BankAccount.dao;

import av.BankAccount.dto.Account;
import av.BankAccount.dto.Person;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDaoFileImpl implements BankAccountDao{
    List<Person> persons = new ArrayList<>();

    @Override
    public Person addPerson(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public List<Person> getAllPerson() {
        return new ArrayList(persons);
    }

    @Override
    public Person getPerson(String firstName) {
        return null;
    }

    @Override
    public Person removePerson(String firstName) {
        return null;
    }

    @Override
    public Account makeAccount(Person person) {
        return null;
    }

    @Override
    public Account deposit(Person person) {
        return null;
    }

    @Override
    public Account withdraw(Person person) {
        return null;
    }
}
