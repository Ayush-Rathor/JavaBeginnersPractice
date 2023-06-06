import java.awt.*;
import java.awt.event.*;

class eventPractise extends Frame implements ActionListener{
TextField tf;
eventPractise(){
tf= new TextField();
tf.setBounds(50,100,300,30);
Button b = new Button("Click me");
b.setBounds(50,200,300,30);
b.addActionListener(this);
add(tf);add(b);
setSize(600,600);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e){
	tf.setText("This is an awt program");
	}
	public static void main(String args[]){
		new eventPractise();
		}
}