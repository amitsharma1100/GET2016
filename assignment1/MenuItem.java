package session5.assignment1;

/**
 * 
 * @author amit
 *
 */
public class MenuItem {

	//text of the input string
	private String label;
	
	//type of the input string
	private int type;
	
	//a menu item can have a sub menu 
	Menu menu;
	
	/**
	 * 
	 * @param label- text of the menu item
	 * @param type -type of the menu item can be ---MENU_TYPE or BACK_TYPE or NON_MENU_TYPE
	 */
	public MenuItem(String label, int type) {
		this.label = label;
		this.type = type;
		this.menu=new Menu();
	}
	
	public MenuItem() {
		this.menu=new Menu();
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}