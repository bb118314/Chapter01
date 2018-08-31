package YouDoIt;
import javax.swing.JOptionPane;

public class HelloNameDialog {

	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog(null, "What is your name?");
		
		Object[] options = {"What's Updog?",
        "No way!"};
		int n = JOptionPane.showOptionDialog(null,
				result + ", Would you like free Updog?",
				"no trickery here :)",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
	}

}
