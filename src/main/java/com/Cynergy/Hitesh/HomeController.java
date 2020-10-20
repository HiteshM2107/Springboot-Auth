package com.Cynergy.Hitesh;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller class to handle requests coming from the client
@Controller
public class HomeController {
	@RequestMapping("home") //to map the request, similar to creating an end-point
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession(); //Session helps to handle data between pages
		String name =  req.getParameter("name"); //"name" is the key name in the URL
		System.out.println("hi "+ name);	
		session.setAttribute("name", name); //"name" is the key name in the transfer of data btwn pages
		return "home";	// go to home.jsp (consult application.properties to understand this better)
	}
}
