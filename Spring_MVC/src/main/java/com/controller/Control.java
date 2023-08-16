package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {

	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("index page run....");
		model.addAttribute("name", "jasani chirag");
		model.addAttribute("age", 23);
		List<String> list = new ArrayList<String>();
		list.add("jasani");
		list.add("milan");
		list.add("amit");
		list.add("hardik");
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/uboutUs")
	public String about() {
		System.out.println("About us .....");
		return "uboutUs";
	}
}
