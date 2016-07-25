package session1.assignment2;

import java.awt.LayoutManager;

public class Calculator {
	
	// a calculator has keys and layout
	private Keys keys;
	private Layout layout;

	public Keys getKeys() {
		return keys;
	}

	public void setKeys(Keys keys) {
		this.keys = keys;
	}

	public Layout getLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public Calculator() {

	}

	public Calculator(int width, int height) {

	}

	public Calculator(int width, int height, LayoutManager layout) {

	}

}
