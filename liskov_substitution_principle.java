class client{
    List<nonWithdrawableAccount> nwd ;
    List<wthdrawableAccount> wd;

    client(List<nonWithdrawableAccount> nwd, List<wthdrawableAccount> wd){
        this.nwd = nwd;
        this.wd = wd;
    }

    public void processTransaction(){
        for(wthdrawableAccount w : wd){
            w.deposit(1000.00);
            w.withdraw(500);
        }
        for(nonWithdrawableAccount nw : nwd){
            nw.deposit(1000.00);g
        }
    }

}

public abstract class nonWithdrawableAccount{
    void deposit(double amount);
}
public abstract class withdrawableAccount implements nonWithdrawableAccount{
    void withdraw(double amount);
}

class fixedDepositAccount implements nonWithdrawableAccount{
    double balance;
    fixedDepositAccount(double balance){
        this.balance = balance;
    }
    @java.lang.Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Balance : " + balance);
    }
}

class currentAccount{
}

class savingAccount{
}