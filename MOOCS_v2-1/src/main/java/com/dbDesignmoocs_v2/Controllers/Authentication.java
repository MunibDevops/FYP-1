package com.dbDesignmoocs_v2.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbDesignmoocs_v2.Dao.LearnerRepository;
import com.dbDesignmoocs_v2.Dao.ResourcePersonRepository;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Learners;
import com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons;
import com.dbDesignmoocs_v2.helper.Message;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Authentication {
	
	@Autowired
	ResourcePersonRepository rpRepository;
	
	@Autowired
	LearnerRepository lrRepository;
	
	@RequestMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("title", "Signup | MOOCS");
		model.addAttribute("resourcePersons", new ResourcePersons());
		
		return "signup";
		
	}
	
	
	@PostMapping("/do_register")
	public String registerResourcePerson(Model model,@ModelAttribute("resourcePersons")ResourcePersons resourcePersons,HttpSession session)
	{
		try {

					
					resourcePersons.setRole("ResourcePerson");
					
					ResourcePersons resp=this.rpRepository.save(resourcePersons);
					
					model.addAttribute("resourcePersons",new ResourcePersons());
					session.setAttribute("message",new Message("Successfully registered !! ","alert-success"));
     			
//				else if(Role.equals("learner"))
//				{
//					
//					Learners lr=this.lrRepository.save(learner);
//					model.addAttribute("learner", new Learners());
//					session.setAttribute("message",new Message("Successfully registered !! ","alert-success"));
//				}
				
				
				
		return "signup";
		}
		catch (Exception e) {
			e.printStackTrace();
			
			model.addAttribute("resourcePersons",resourcePersons);
			session.setAttribute("message",new Message("Something Went Wrong !! "+e.getMessage(),"alert-danger"));
			return "signup";
		}
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	

