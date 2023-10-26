
package com.example.demo.controller;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.admin.admin;
import com.example.demo.adminRepository.adminRepository;
import com.example.demo.adminService.adminService;
import com.example.demo.company.company;
import com.example.demo.repos.companyRepository;
import com.example.demo.service.companyService;
import com.example.demo.userId.user;
import com.example.demo.userRepository.userRepository;
import com.example.demo.userService.userService;
import com.example.demo.userTime.userTime;
import com.example.demo.userTimeRepository.userTimeRepository;

@Controller
public class companyController {
	@Autowired
	public userService us;
	@Autowired
	public companyRepository cr;
	@Autowired
	public adminService as;
	@Autowired
	public adminRepository ar;
	@Autowired
	public userRepository ur;
	@Autowired
	public userTimeRepository utr;
	public userTime ut;
	
	
	
		
	@GetMapping("/companys")
	public String frame(Model model) {
		
		return "first";
	}
	@GetMapping("/admin")
	public String Admin(Model model) {
		
		return "admin";
	}

	@GetMapping("/check")
	public ModelAndView booklist(@ModelAttribute user User) {
		user userDemo=us.login(User.getUserId(),User.getPassword());
		
	if(Objects.nonNull(userDemo))
	{
		List<company> list=cr.findAll();
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("allow");
		mv.addObject("book",list);
		return new ModelAndView("allow","book",list);
	
	} else {
	
		return new ModelAndView("tryagain");
	
	}}
	
	@GetMapping("/admincheck")
	public ModelAndView admincheck(@ModelAttribute admin ad) {
		admin add=ar.findByAdminNameAndPsw(ad.getAdminName(),ad.getPsw());
		
	if(Objects.nonNull(add))
	{
		List<company> list=cr.findAll();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminpage");
		mv.addObject("book",list);
		return new ModelAndView("adminpage","book",list);
	
	} else {
	
		return new ModelAndView("tryagain");
	
	}}
	@GetMapping("/edituser/{no}")
	public ModelAndView edituser(@PathVariable long no) {
		user use=ur.findById(no).get();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("edituser");
		mv.addObject("eu",use);
		return new ModelAndView("edituser","eu",use);
	}
	@GetMapping("/listuser")
	public ModelAndView usersave(@ModelAttribute user use) {
		
		List<user> list=ur.findAll();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userlist");
		mv.addObject("boo",list);
		return new ModelAndView("userlist","boo",list);
	}
	@GetMapping("/deletecmy/{no}")
	public String userDelete(@PathVariable int no) {
		    cr.deleteById(no);
			return "redirect:/adminpag";

	}
	@GetMapping("/editcpy/{no}")
	public ModelAndView editcmy(@PathVariable  int no) {
		company use=cr.findById(no).get();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("editcompanys");
		mv.addObject("b",use);
		return new ModelAndView("editcompanys","b",use);
	}
	@GetMapping("/adminpag")
	public ModelAndView adminPage() {
		
		List<company> list=cr.findAll();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminpage");
		mv.addObject("book",list);
		return new ModelAndView("adminpage","book",list);
	}
	@GetMapping("/addcompany")
	public String cmysave() {
		
		return "addcompany";
	}
	@GetMapping("/saveuser")
	public String userSave(user use) {
		ur.save(use);
		return "redirect:/listuser";
	}
	
	@GetMapping("/savecompany")
	public String savecompany(company cmy) {
		
		cr.save(cmy);
		return "redirect:/adminpag";
	}
	@GetMapping("/deleteuser/{no}")
	public String userDelete(@PathVariable long no) {
		    ur.deleteById(no);
			return "redirect:/listuser";

	}
	@GetMapping("/adduser")
	public String saveUser(user use) {
		
		ur.save(use);
		return "redirect:/adminpag";
	}



	
}
