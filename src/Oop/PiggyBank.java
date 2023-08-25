package Oop;

public class PiggyBank {
	
	// 클래스 내 member
	// field (멤버 변수, 속성, 특성, 변수)
	// method (멤버 기능, 행동, 행위, 동작)
	
	int money; // 돈
	
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금 : "+money);
	}
	
	public void withdraw(int money) {
		this.money -= money;
		System.out.println("출금 : "+money);
	}
	
	public void showMoney() {
		System.out.println("현재 잔액 : " + money);
	}
	
	
}
