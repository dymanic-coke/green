package project;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {
	
	protected String menuText;
	protected Menu preMenu;
	protected static final Scanner scanner = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu preMenu) {
		this.menuText = menuText;
		this.preMenu = preMenu;
	}
	
	public void print() {
		System.out.print("\n" + menuText);
	}
	
	public void setPreMenu(Menu preMenu) {
		this.preMenu = preMenu;
	}
}
