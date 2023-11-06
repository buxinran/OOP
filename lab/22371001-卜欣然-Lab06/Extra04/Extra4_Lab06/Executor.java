package Extra4_Lab06;
import java.util.ArrayList;
import java.util.List;
public class Executor {
	List<ICommand> command=new ArrayList<>();
	public void add(ICommand command) {
		this.command.add(command);
	}
	public void run() {
		for(ICommand element:command) {
			element.excute();
		}
	}
}
