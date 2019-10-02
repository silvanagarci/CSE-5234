package edu.osu.cse5234.model;

import java.util.List;

public class Order implements java.io.Serializable {
	List<Item> items;
	
	public Order() {
		
	}
	
	public List<Item> getItems() {
		return this.items;
	}
	
	public void setItems(final List<Item> list) {
		this.items = list;
	}
}
