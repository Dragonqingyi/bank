package bank3;

/**
 * Created by 时光与你 on 2017/5/4.
 */
public class CheckingAccount extends Acount {
    //透支额度
    private double overdraftProtection;
/*
两参构造器
一是账户余额
二是透支额度
 */
    public CheckingAccount(double init_balance, double overdraft) {
        super(init_balance);
        this.overdraftProtection = overdraft;
    }

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }
    /*
    重写取款方法
    如果余额-1>=amt,直接取款

     */
    public boolean withdaw(double amt){
        boolean isRight =false;
        if (super.balance - 1 >= amt){
            super.balance -= amt;
            isRight = true;
        }else {
            //余额不足，用透支额来弥补
            double money = amt - overdraftProtection;
            if (money <= this.overdraftProtection){
                //透支额足够
                overdraftProtection -= money; //透支额，减去差额，剩下的是可以继续透支的额度
                //使用了透支额，所以余额为0
                super.balance = 0;
                isRight = true;
            }else {
                //透支额太大，不足以撑起信用额度
                isRight = false;
            }
        }
        return isRight;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }
}
