package Question5_lab05;

public class Motorbike extends Vehicle{
	protected Person driver;
	protected Person passenger;
	/*setting driver*/
	public void setDriver(Person driver) {
		this.driver=driver;
	}
	/*setting passenger*/
	public void setPassenger(Person passenger) {
		this.passenger=passenger;
	}
	/*rewrite toString*/
	public String toString() {
		return String.format("driver:"+driver.getName()+".\npassenger:"+passenger.getName()+".\nMotorbike has "+cnt+" wheels.");
	}
}
