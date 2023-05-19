package com.smartcode.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class HelloStudentsController {

	@RequestMapping("/showForm")
	public String showStudentForm() {
		return "HelloStudentsForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "HelloStudentsSpring";
	}
	
	@RequestMapping("/processForm2")
	//public String otherProcessForm(HttpServletRequest request, Model model) { 
	public String otherProcessForm(@RequestParam(value = "studentName") String name, Model model) {
		//String name = request.getParameter("studentName");
		name += " is the best student";
		String finalMessage = "Who is the best student? "+ name;
		model.addAttribute("message", finalMessage);
		return "HelloStudentsSpring";
	}
}
