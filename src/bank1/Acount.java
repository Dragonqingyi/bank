package bank1;

/**
 * Created by 时光与你 on 2017/5/3.
 */
public class Acount {
    private double balance;


    public Acount(double init_balance) {
        this.balance = init_balance;
        //构造器作用：初始化！！！
    }
    //存钱
    public void deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
        }else {
            System.out.println("存钱金额必须大于0！");
        }
    }

    //取钱
    public void withdaw(double amt){
        if (amt > 0){
            if (this.balance - 1 >= amt){
                this.balance -= amt;
            }
        }else {
            System.out.println("取钱金额必须大于0！");
        }
    }
    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
