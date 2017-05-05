package bank3;

/**
 * Created by 时光与你 on 2017/5/4.
 */
public class SavingAccount extends Acount {    //父类没有无参构造，子类必须和父类一样
    /*
    存款利率
     */
    private double interstRate;

    public SavingAccount(double init_balance, double interst_rate) {
        super(init_balance);
        this.interstRate = interst_rate;
    }

    public SavingAccount(double init_balance) {
        super(init_balance);
    }
}
