package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	//这里代表网站后面什么都不加，跳转到主页
	//对应WebContent\WEB-INF\content\main.jsp
	@RequestMapping(value="")
    public String main(Model model) {
    	model.addAttribute("message","hello");
    	return "main";
    }
}
