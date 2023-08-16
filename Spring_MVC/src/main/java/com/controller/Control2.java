package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control2 {

	@RequestMapping("/view")
	public String view() {
		System.out.println("view page run....");
		return "view";
	}

//	@RequestMapping(value = "/data", method = RequestMethod.POST)
//	public String data(HttpServletRequest req) { // view to controller data transfer
//
//		String name = req.getParameter("email");
//		String address = req.getParameter("address");
//		String pass = req.getParameter("password");
//		System.out.println(name + " : " + address + " : " + pass + " : ");
//		return "data";
//	}

	@RequestMapping(path = "/data", method = RequestMethod.POST)
	public String data(@RequestParam("email") String email, @RequestParam("address") String add,
			@RequestParam("password") String pass, Model m) {
		System.out.println(email + " : " + add + " : " + pass);
		m.addAttribute("email", email);
		m.addAttribute("add", add);
		m.addAttribute("pass", pass);
		return "data";
	}
}
