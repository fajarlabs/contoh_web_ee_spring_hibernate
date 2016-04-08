package com.skckonline.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tentang-skck")
public class AboutController {
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "about";
	}
}