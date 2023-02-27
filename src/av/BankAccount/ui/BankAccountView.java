package av.BankAccount.ui;

import av.BankAccount.dto.Person;

import java.util.List;

public class BankAccountView {

    private UserIO io;

    public BankAccountView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Create a Person");
        io.print("2. Create a Bank Account");
        io.print("3. Access Bank Account");
        io.print("4. Display all People");
        io.print("Exit");

        return io.readInt("Please select from the above choices", 1, 5);
    }

    public void displayCreatePersonBanner() {
        io.print("=== Create Person ===");
    }

    public Person getNewPersonInfo() {
        String firstName = io.readString("Please enter First Name");
        Person currentPerson = new Person(firstName);
        return currentPerson;
    }

    public void displayCreateSuccessBanner() {
        io.readString("Person successfully created. Please hit enter to continue");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command");
    }

    public void displayAllPersonBanner() {
        io.print("=== Display All Persons ===");
    }

    public void displayPersonList(List<Person> personList) {
        for(Person currentPerson: personList){
            String personInfo = String.format("%s", currentPerson.getFirstName());
            io.print(personInfo);
        }
        io.readString("Please hit enter to continue");
    }
}
