package oop;

/**
 * Account 클래스를 상속받는 마이너스 계좌
 * @author 이대한
 * @Date   2023. 1. 4.
 */
public class MinusAccount extends Account {
	// 새롭게 추가된 속성
	private long borrowMoney;
	private String borrowDate;
	
	public MinusAccount() {}
	public MinusAccount(String number, String owner, int passwd, long money, long borrowMoney, String borrowDate) {
		super(number, owner, passwd, money);
		this.borrowMoney = borrowMoney;
		this.borrowDate = borrowDate;
	}
	public long getBorrowMoney() {
		return borrowMoney;
	}
	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	// 잔액(restMoney - borrowMoney) 재정의(Overriding)
	public long getRestMoney() {
		return super.getRestMoney() - borrowMoney;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + borrowMoney + "\t" + borrowDate;
	}
}