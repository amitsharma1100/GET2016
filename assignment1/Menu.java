package session5.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author amit
 *
 */
public class Menu {

	//menu can have multiple menu items
	private List<MenuItem> menuItems;
	
	/**
	 * Constructor-intializes the menuItems list
	 */
	public Menu()
	{
		this.menuItems=new ArrayList<MenuItem>();
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
}