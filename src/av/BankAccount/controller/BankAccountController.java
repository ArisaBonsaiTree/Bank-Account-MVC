package av.BankAccount.controller;

import av.BankAccount.dao.BankAccountDao;
import av.BankAccount.dto.Person;
import av.BankAccount.ui.BankAccountView;

import java.util.List;

public class BankAccountController {
    private BankAccountView view;
    private BankAccountDao dao;

    public BankAccountController(BankAccountView view, BankAccountDao dao) {
        this.view = view;
        this.dao = dao;
    }

    public void run(){
        int menuSelection;
        boolean keepGoing = true;

        while (keepGoing){
            menuSelection = getMenuSelection();

            switch (menuSelection){
                case 1:
                    createPerson();
                    break;
                case 2:
                    System.out.println("Creating bank account");
                    break;
                case 3:
                    System.out.println("Access Bank Account");
                    break;
                case 4:
                    displayAllPersons();
                    break;
                case 5:
                    System.out.println("Leaving program");
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }
        }

        exitMessage();

    }

    private int getMenuSelection(){
        return view.printMenuAndGetSelection();
    }

    private void createPerson(){
        view.displayCreatePersonBanner();
        dao.addPerson(view.getNewPersonInfo());
        view.displayCreateSuccessBanner();
    }

    private void displayAllPersons(){
        view.displayAllPersonBanner();
        List<Person> personList = dao.getAllPerson();
        view.displayPersonList(personList);
    }

    private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }

    private void exitMessage(){
        view.displayExitBanner();
    }

}
