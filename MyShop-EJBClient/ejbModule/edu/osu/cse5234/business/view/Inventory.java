package edu.osu.cse5234.business.view;

import java.util.List;


public class Inventory implements java.io.Serializable {
	List<Item> items;

	
	public List<Item> getItems() {
		return this.items;
	}
	
	public void setItems(final List<Item> list) {
		this.items = list;
	}
}
