package Extra1_Lab06;

public class Test {
	public static void main(String[] args) {
		Splitter a=new Splitter();
		UpperCaseProcessor b=new UpperCaseProcessor();
		SnakeCaseProcessor c=new SnakeCaseProcessor();
		process(a,"Hello world!");
		process(b,"Hello world!");
		process(c,"Hello world!");
	}
	public static void process(ITextProcess p, String s) {
		System.out.println(p.process(s));
	}
}
