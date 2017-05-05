package bank2;

/**
 * Created by 时光与你 on 2017/5/3.
 */
public class Acount {
    private double balance;


    public Acount(double init_balance) {
        this.balance = init_balance;
        //构造器作用：初始化！！！
    }
    /*
    存款方法
    amt存款金额
    true存款成功
    false存款失败
    */
    public boolean deposit(double amt) {
        boolean isRight;
        if (amt > 0) {
            this.balance += amt;
            isRight = true;
        }else {
            System.out.println("存钱金额必须大于0！");
            isRight = false;
        }
        return isRight;
    }

    /*
    取款方法
    amt存款金额
    true存款成功
    false存款失败
     */
    public boolean withdaw(double amt){
        boolean isRight;
        if (amt > 0){
            if (this.balance - 1 >= amt){//取钱必须小于原来的钱
                this.balance -= amt;
                isRight = true;
            }else {
                isRight = false;
            }
        }else {
            System.out.println("取钱金额必须大于0！");
            isRight = false;
        }
        return isRight;
    }
    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
