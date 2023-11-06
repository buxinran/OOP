package Extra4_Lab06;

public class BuyVodka  implements ICommand{
	private Bar bar;
	private int num;
	public BuyVodka(Bar bar,int num) {
		this.bar=bar;
		this.num=num;
	}
	public void excute() {
		bar.buyVodka(num);
	}
}
