package av.BankAccount;

import av.BankAccount.controller.BankAccountController;
import av.BankAccount.dao.BankAccountDao;
import av.BankAccount.dao.BankAccountDaoFileImpl;
import av.BankAccount.ui.BankAccountView;
import av.BankAccount.ui.UserIO;
import av.BankAccount.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        BankAccountView myView = new BankAccountView(myIo);
        BankAccountDao myDao = new BankAccountDaoFileImpl();

        BankAccountController controller = new BankAccountController(myView, myDao);
        controller.run();
    }
}
