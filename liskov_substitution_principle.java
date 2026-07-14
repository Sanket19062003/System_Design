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
public abstract class withdrawableAccount{

}

class fixedDepositAccount{
}

class currentAccount{
}

class savingAccount{
}