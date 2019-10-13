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
@RequestMapping("")
public class Home {
	@RequestMapping(method = RequestMethod.GET)
	public String viewOrderEntryPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "home";
	}
	
	@RequestMapping(path = "ContactUs", method = RequestMethod.GET)
	public String viewContactUsPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "ContactUs";
	}
	@RequestMapping(path = "AboutUs", method = RequestMethod.GET)
	public String viewAboutUsPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "AboutUs";
	}

}
