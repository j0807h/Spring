package com.jh.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jh.test.domain.PersonVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	/*
	 * test ModelAndView Controller
	 * */
	
	@RequestMapping("/testView")
	public ModelAndView testView() {
		
		//데이터와 뷰를 동시에 설정 가능
		ModelAndView mav = new ModelAndView();
		
		//mav.setView("뷰의 경로")
		mav.setViewName("view"); //뷰의 이름(view.jsp)
		
		//mav.addObject("변수 이름", "데이터 값")
		mav.addObject("data", "123456"); //뷰로 보낼 데이터 값
		mav.addObject("type", "student"); 
		
		return mav;
	}
	
	/*
	 * 모델 클래스(DTO, VO 클래스)를 이용해 ModelAndView 사용
	 * */
	@RequestMapping("/testViewVo")
	public ModelAndView testViewVo() {
		
		ModelAndView mav = new ModelAndView();
		
		//모델 클래스 객체 생성
		PersonVo vo = new PersonVo();
		
		//데이터 담기
		vo.setName("jeong");
		vo.setAge(20);
		vo.setGender("female");
		
		mav.addObject("vo", vo);
		mav.addObject("type", "dev"); //간단 데이터 담기
		mav.setViewName("viewVo"); //이동할 페이지 설정(viewVo.jsp)
		
		return mav;
	}
	
}
