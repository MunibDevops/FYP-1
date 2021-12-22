package com.dbDesignmoocs_v2.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

	
@Controller
public class Allviews {


	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("title", "Home | MOOCS");
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title", "About | MOOCS");
		return "about";
		
	}
	
	@RequestMapping("/authenticity")
	public String authenticity(Model model)
	{
		model.addAttribute("title", "Authenticity | MOOCS");
		return "authenticity";
		
	}
	@RequestMapping("/contact")
	public String contact(Model model)
	{
		model.addAttribute("title", "Contact | MOOCS");
		return "contact";
		
	}
	@RequestMapping("/courses")
	public String courses(Model model)
	{
		model.addAttribute("title", "Courses | MOOCS");
		return "courses";
		
	}
	@RequestMapping("/signin")
	public String signin(Model model)
	{
		model.addAttribute("title", "Signin | MOOCS");
		return "signin";
		
	}

	@RequestMapping("/test-service")
	public String test_service(Model model)
	{
		model.addAttribute("title", "Services | MOOCS");
		return "test-service";
		
	}
	
	@RequestMapping("/sidebar")
	public String sidebar(Model model)
	{
		model.addAttribute("title", "Sidebar | MOOCS");
		return "sidebar";
		
	}
	
	
	
	@RequestMapping("/about-team")
	public String team(Model model)
	{
		model.addAttribute("title", "Team | MOOCS");
		return "about-team";
		
	}

	
	@RequestMapping("/dashboard")
	public String resourcePerson(Model model) {
		
		model.addAttribute("title", "Dashboard");
		return "Resource_person/Dashboard";
	}
	
	}




