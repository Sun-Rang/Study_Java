package Oop;

public class piggyBankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 레퍼런스 데이터 타입
		
		PiggyBank bank1 = new PiggyBank();
		PiggyBank bank2 = new PiggyBank();
		
		bank1.money = 0;
		bank1.deposit(3000);
		bank1.withdraw(200);
		bank1.showMoney();
		
		
	}

}
