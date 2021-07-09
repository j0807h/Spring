package com.sp.testModelAndView.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login() {
		return "login";
	}
	
	
	// ModelAndView를 사용해보자
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView testView() {
		ModelAndView view = new ModelAndView();
		
		view.setViewName("viewList"); // setViewName : 어떤 페이지를 보여줄 것인지
		
		//request.setAttribute("key", "value");
		view.addObject("title", "제목"); // addObject : key와 value를 담아 보낼 수 있는 메서드
		view.addObject("number", "1");
		view.addObject("writer", "글쓴이"); 
		
		return view;
	}
}
