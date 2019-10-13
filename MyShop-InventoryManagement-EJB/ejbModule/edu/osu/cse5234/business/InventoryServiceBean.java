package edu.osu.cse5234.business;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.model.Item;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
@Remote(InventoryService.class)
public class InventoryServiceBean implements InventoryService {

    /**
     * Default constructor. 
     */
    public InventoryServiceBean() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * getAvailableInventory. 
     */
    public Inventory getAvailableInventory() {
    	Inventory inventory = new Inventory();
    	
    	List<Item> items = new ArrayList<Item>();
		Item heel = new Item();
		heel.setName("Heel");
		heel.setPrice("20");
		heel.setQuantity("0");
		
		Item flat = new Item();
		flat.setName("Flat");
		flat.setPrice("20");
		flat.setQuantity("0");
		
		Item fancyHeel = new Item();
		fancyHeel.setName("Fancy Heel");
		fancyHeel.setPrice("200");
		fancyHeel.setQuantity("0");
		
		Item fancyFlat = new Item();
		fancyFlat.setName("Fancy Flat");
		fancyFlat.setPrice("200");
		fancyFlat.setQuantity("0");
		
		Item superFancyHeel = new Item();
		superFancyHeel.setName("Super Fancy Heel");
		superFancyHeel.setPrice("2000");
		superFancyHeel.setQuantity("0");
		
		Item superFancyFlat = new Item();
		superFancyFlat.setName("Super Fancy Flat");
		superFancyFlat.setPrice("2000");
		superFancyFlat.setQuantity("0");
		
		items.add(heel);
		items.add(flat);
		items.add(fancyHeel);
		items.add(fancyFlat);
		items.add(superFancyHeel);
		items.add(superFancyFlat);
		
		
		inventory.setItems(items);
    	return inventory;       
    }
    /**
     * validateQuantity. 
     */
    public boolean validateQuantity(List<Item> items) {
		return true;
    }
    /**
     * getAvailableInventory. 
     */
    public boolean updateInventory(List<Item> items) {
		return true;
    }

}
