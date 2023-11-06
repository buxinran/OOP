package Extra4_Lab06;

public class BuyEggFriedRice implements ICommand{
	private Bar bar;
	private int num;
	public BuyEggFriedRice(Bar bar,int num) {
		this.bar=bar;
		this.num=num;
	}
	public void excute() {
		bar.buyFriedRice(num);
	}
}
