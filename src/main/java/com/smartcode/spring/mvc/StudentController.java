package com.smartcode.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder
	public void binder(WebDataBinder binder) {
		StringTrimmerEditor trimSpacesBlank = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimSpacesBlank);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("theStudent", student);	
		return "StudentRegistrationForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("theStudent") Student student,
			BindingResult validationResult) {
		
		if(validationResult.hasErrors()) {
			return "StudentRegistrationForm";
		}
		
		return "ConfirmRegistrationStudent";
	}
	
}
