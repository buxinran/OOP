package Extra4_Lab06;

public class SpendMoney implements ICommand{
	private Engineer engineer;
	private double money;
	public SpendMoney(Engineer engineer,double money) {
		this.engineer=engineer;
		this.money=money;
	}
	public void excute() {
		engineer.spendMoney(money);
	}
}
