package com.smartcode.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secondary")
public class OtherController {
	
	@RequestMapping("/showForm")
	public String showStudentForm() {
		return "HelloStudentsForm";
	}
	
	@RequestMapping("/processForm2")
	//public String otherProcessForm(HttpServletRequest request, Model model) { 
	public String otherProcessForm(@RequestParam(value = "studentName") String name, Model model) {
		//String name = request.getParameter("studentName");
		name += " is the bad student";
		String finalMessage = "Who is the bad student? "+ name;
		model.addAttribute("message", finalMessage);
		return "HelloStudentsSpring";
	}
	
}
