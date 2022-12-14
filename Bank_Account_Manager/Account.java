package Bank_Account_Manager;

public abstract class Account {

    Account(){}

    public abstract String get_client_name();

    public abstract int get_balance();

    public abstract void top_up_the_balance(int m);

    public abstract int withdraw(int m);

    public abstract int pay(int m);

    public abstract int get_credit_balance();

    public abstract int take_credit(int m);

    public abstract int put_money_for_credit(int m);

    public abstract String get_account_type();

}
