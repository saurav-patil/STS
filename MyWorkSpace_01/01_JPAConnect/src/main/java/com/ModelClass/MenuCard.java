package com.ModelClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuCard {
	@Id
	@Column (name = "MENU_ID")
	private int menuId;
	@Column (name = "MENU_NAME")
	private String menuName;
	@Column (name = "MENU_PRICE")
	private double menuPrice;
	
	public MenuCard() {
		
	}
	
	public MenuCard(int menuId, String menuName, double menuPrice) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}
}
