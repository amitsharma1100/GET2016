package session1.assignment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keys implements ActionListener {

	private String Label;

	public Keys() {

	}

	public Keys(String label) {

	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public boolean isLabelValid() {
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
