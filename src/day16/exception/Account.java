package day16.exception;//5

public class Account {
    private int balance; // 잔액

    public Account(int balance) {
        this.balance = balance;
    }

    //출금 기능
    public void withDraw(int money) throws Exception{
        if(balance < money) {
            //컴퓨터가 봤을 때는 에러 아님. 그냥 true나 false일뿐. 근데 사람이 봤을 때는 에러상황임. -> 에러를 발생시켜버림.
            //에러를 유발하면 에러 메세지를 보낼 수 있음.
            //throw: 유발하다(raise) 의 의미.
            throw new Exception("잔액이 부족합니다.");
        }
        this.balance -= money;
    }
}
