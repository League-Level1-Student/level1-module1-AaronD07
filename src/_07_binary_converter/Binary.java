package _07_binary_converter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements MouseListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField input = new JTextField(20);
JLabel label = new JLabel();
JButton button = new JButton();


public void UI() {
	frame.add(panel);
	panel.add(input);
	panel.add(button);
	button.setText("Convert");
	panel.add(label);
	
	label.setText("Convert from Binary to ASCII");
	frame.setVisible(true);
	
	button.addMouseListener(this);
	
}


@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	String x = input.getText();
	String y = convert(x);

	label.setText(y);
	frame.pack();

}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

                                       
}
