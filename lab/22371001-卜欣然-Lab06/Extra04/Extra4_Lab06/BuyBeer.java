package Extra4_Lab06;

public class BuyBeer implements ICommand{
	private Bar bar;
	private int num;
	public BuyBeer(Bar bar,int num) {
		this.bar=bar;
		this.num=num;
	}
	public void excute() {
		bar.buyBeer(num);
	}
}
