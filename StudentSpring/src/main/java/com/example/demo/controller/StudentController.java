package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.beans.Studentbean;
import com.example.demo.student.repo.StudentRepo;
import com.example.demo.beans.Studentbean;;
@Controller
public class StudentController {
	@Autowired
	private StudentRepo repo;
	 @GetMapping("/student")
	 public String showHomePage() {
		return "index" ;
	 }
	@PostMapping("/student/insert")//in url 8585
	 public  String login(Studentbean st,Model model) {
		repo.save(st);
		System.out.println(""+ st.getName());
		model.addAttribute("st",st);
		return "success";
		  }
	 
	@GetMapping("/student/view")
	public String  view(Model model){
		List<Studentbean> stlst=new ArrayList<Studentbean>();
		stlst=repo.findAll();
		List<Studentbean> sl=new ArrayList<Studentbean>();
		sl=repo.findByIdBetween(1,4);
		model.addAttribute("stlst", stlst);
		model.addAttribute("sl",sl);
		return "view";
	}
	 

}
