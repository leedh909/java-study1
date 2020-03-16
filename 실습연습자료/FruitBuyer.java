package firstjava;

public class FruitBuyer {
	
	int myMoney=5000;
	int numOfApple=0;
	
//	private int myMoney;
//	private int numOfApple;
	
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
		
	}
	public void showBuyResult() {
		System.out.println("현재 잔액 : "+myMoney);
		System.out.println("현재 잔액 : "+numOfApple);
	}
}
