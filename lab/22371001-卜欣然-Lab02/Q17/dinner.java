package lab02;

public class dinner {
	public static void main(String [] args) {
		person2.buyers aunt=new person2.buyers();
		person2.buyers mother=new person2.buyers();
		person2.buyers me=new person2.buyers();
		person2.cook aunt1=new person2.cook();
		person2.cook father=new person2.cook();
	}
}
//采购员和厨师都有共同的父类人
class person2{
	//采购员类
	static class buyers{
		String[] ingredients;
	}
	//厨师类
	static class cook{
		String[] dish;
	}
}