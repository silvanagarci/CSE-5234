package edu.osu.cse5234.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.osu.cse5234.model.*;

@Controller
@RequestMapping("/purchase")
public class Purchase {
	@RequestMapping(method = RequestMethod.GET)
	public String viewOrderEntryPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ... instantiate and set order object with items to display
		//
		
		Order order = new Order();
		List<Item> items = getItemList();
		order.setItems(items);
		request.setAttribute("order", order);
		
		return "OrderEntryForm";
	}

	@RequestMapping(path = "/submitItems", method = RequestMethod.POST)
	public String submitItems(@ModelAttribute("order") Order order, HttpServletRequest request) {
		//Updates with the new quantities. Calculate price here? No?
		request.getSession().setAttribute("order", order);
		return "redirect:/purchase/paymentEntry";
	}

	@RequestMapping(path = "/paymentEntry", method = RequestMethod.GET)
	public String viewPaymentEntryPage(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("payment", new PaymentInfo());
		return "PaymentEntryForm";
	}
	
	@RequestMapping(path = "/submitPayment", method = RequestMethod.POST)
	public String submitPayment(@ModelAttribute("payment") PaymentInfo payment, HttpServletRequest request) {
		request.getSession().setAttribute("payment", payment);
		return "redirect:/purchase/shippingEntry";
	}
	
	@RequestMapping(path = "/shippingEntry", method = RequestMethod.GET)
	public String viewShipmentEntryPage(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("shipment", new ShippingInfo());
		return "ShippingEntryForm";
	}
	
	@RequestMapping(path = "/submitShipping", method = RequestMethod.POST)
	public String submitShipping(@ModelAttribute("shipment") ShippingInfo shipment, HttpServletRequest request) {
		request.getSession().setAttribute("shipment", shipment);
		return "redirect:/purchase/viewOrder";
	}
	
	@RequestMapping(path = "/viewOrder", method = RequestMethod.GET)
	public String viewOrderPage(HttpServletRequest request, HttpServletResponse response) {
		//i am going to calculate price here
		Order order = (Order)request.getSession().getAttribute("order");
		int price = 0;
		List<Item> itemsInOrder = order.getItems();
		for (Item item : itemsInOrder) {
			price += Integer.parseInt(item.getQuantity()) * Integer.parseInt(item.getPrice());
		}
		String priceString = Integer.toString(price);
		System.out.println(priceString);
		request.setAttribute("price", priceString);
		
		return "ViewOrder";
	}
	
	@RequestMapping(path = "/confirmOrder", method = RequestMethod.POST)
	public String confirmOrder(@ModelAttribute("payment") ShippingInfo payment, HttpServletRequest request) {
		//validate shipment info?? idk lol, database stuff is here
		return "redirect:/purchase/viewConfirmation";
	}
	
	@RequestMapping(path = "/viewConfirmation", method = RequestMethod.GET)
	public String viewConfirmation(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("shipment", new ShippingInfo());
		return "Confirmation";
	}
	
	private List<Item> getItemList() {
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
		
		
		return items;
	}
}
