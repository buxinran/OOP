package Extra1_Lab06;

public class SnakeCaseProcessor implements ITextProcess{
	public String process(String s) {
		String [] cmd = s.split("\\s+");
		for(int i=1;i<cmd.length;i++) {
			cmd[0]=cmd[0]+"_"+cmd[i];
		}
		return cmd[0];
	}
}
