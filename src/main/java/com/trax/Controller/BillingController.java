package com.trax.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.services.BillingService;
import com.trax.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("bid") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return"create_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill") Billing bill) {
		billingService.saveBill(bill);
		return "";
		
	}

}
