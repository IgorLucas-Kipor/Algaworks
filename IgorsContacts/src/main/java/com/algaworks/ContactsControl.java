package com.algaworks;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactsControl {
	
	private static final List<Contact> CONTACTS_LIST = new ArrayList<>();
	
	static {
		CONTACTS_LIST.add(new Contact("1", "Maria", "+55 31 98421-5714"));
		CONTACTS_LIST.add(new Contact("2", "João", "+55 31 98724-5568"));
		CONTACTS_LIST.add(new Contact("3", "Rodrigo", "+55 31 94431-2579"));
		CONTACTS_LIST.add(new Contact("4", "Júnior", "+55 31 97412-3614"));
		CONTACTS_LIST.add(new Contact("5", "Thaís", "+55 31 99321-7485"));
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contacts")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contacts", CONTACTS_LIST);
		return modelAndView;
	}
	
	@GetMapping("/contacts/novo")
	public ModelAndView newContact() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		modelAndView.addObject("contact", new Contact());
		return modelAndView;
	}
	
	@PostMapping("/contacts")
	public String register(Contact contact) {
		String id = UUID.randomUUID().toString();
		contact.setId(id);
		CONTACTS_LIST.add(contact);
		return "redirect:/contacts";
	}
	
	@GetMapping("/contacts/{id}/editar")
	public ModelAndView edit(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		Contact contact = searchContact(id);
		
		modelAndView.addObject("contact", contact);
		return modelAndView;
	}
	
	@PutMapping ("/contacts/{id}")
	public String update(Contact contact) {
		Integer index = searchContactIndex(contact.getId());
		Contact oldContact = CONTACTS_LIST.get(index);
		CONTACTS_LIST.remove(oldContact);
		CONTACTS_LIST.add(index, contact);
		
		return "redirect:/contacts";
	}
	
	@DeleteMapping ("/contacts/{id}")
	public String remove(@PathVariable String id) {
		Contact contact = searchContact(id);
		CONTACTS_LIST.remove(contact);
		return "redirect:/contacts";
	}
	
	//---------------------------- Auxiliary Methods
	
	public Contact searchContact(String id) {
		Integer index = searchContactIndex(id);
			
			if (index != null) {
				Contact contact = CONTACTS_LIST.get(index);
				return contact;
			}
		return null;
	}
	
	public Integer searchContactIndex(String id) {
		for (int i=0; i<CONTACTS_LIST.size(); i++) {
			Contact contact = CONTACTS_LIST.get(i);
			
			if (contact.getId().equals(id)) {
				return i;
			}
		}
		return null;
	}
}
