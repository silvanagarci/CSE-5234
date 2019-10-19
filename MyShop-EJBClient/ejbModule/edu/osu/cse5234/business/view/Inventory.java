package edu.osu.cse5234.business.view;

import java.util.List;

import edu.osu.cse5234.business.view.Item;


public class Inventory implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -376911873795007009L;
	List<Item> items;

	
	public List<Item> getItems() {
		return this.items;
	}
	
	public void setItems(final List<Item> list) {
		this.items = list;
	}
}
