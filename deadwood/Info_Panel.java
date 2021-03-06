package deadwood;


import javax.swing.*;
import java.awt.Font;


public class Info_Panel
{

	private static JTextArea MyTextArea;

	public Info_Panel()
	{
		LoadInfoPanel();
	}

	public static void LoadInfoPanel() //create textArea
	{

		MyTextArea = new JTextArea(60, 40);
		MyTextArea.setFont(new Font("Serif", Font.BOLD, 15));
		MyTextArea.setLineWrap(true);
		MyTextArea.setBounds(0, 0, 500, 800);
		MyTextArea.setWrapStyleWord(true);
		MyTextArea.setEditable(false);

	}
	public JTextArea getInfoPanel(){ //returns the Jtextarea
		return MyTextArea;
	}

	public static void UserInput(String UserText) //prints to text area
	{
		MyTextArea.setCaretPosition(MyTextArea.getDocument().getLength()); // auto-scolls the pane
		MyTextArea.append(UserText+"\n");
	}


}
