package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.RjModel;

import jakarta.servlet.http.HttpSession;

@Controller
public class Cntrl {
	
	@RequestMapping("/")
	public String h() {
		
		return "index.html";
	}
//	@RequestMapping("login")
//	public String login(@RequestParam("u")String name,@RequestParam("p")String pass, Model m) {
//		m.addAttribute("as",name);
//		m.addAttribute("ts",pass);
//		return "login.jsp";
//		
//	}
	@RequestMapping("login")
	public String save(@RequestParam("u")String name,@RequestParam("p")String pass) {
		
		try {
			Connection c=RjModel.getCon();
			PreparedStatement st=c.prepareStatement("insert into page values(?,?);");
			st.setString(1, name);
			st.setString(2, pass);
			st.executeUpdate();
	
		} catch (Exception e) {
			
		}
		
		return "login.jsp";
	}


	
	 

}
