package av.BankAccount.dao;

public class BankAccountDaoException extends Exception{
    public BankAccountDaoException(String message){
        super(message);
    }

    public BankAccountDaoException(String message, Throwable cause){
        super(message, cause);
    }
}
