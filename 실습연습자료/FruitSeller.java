package firstjava;

public class FruitSeller {

//	final int APPLE_PRICE=1000;
	int APPLE_PRICE;
	int numOfApple=20;
	int myMoney=0;
	
//	private final int APPLE_PRICE;
//	private int numOfApple;
//	private int myMoney;
	 
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void initMembers(int money, int appleNum, int price) {
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	public void showSaleResult() {
		System.out.println("남은 사과 : "+numOfApple);
		System.out.println("남은 사과 : "+myMoney);
	}
	
}
