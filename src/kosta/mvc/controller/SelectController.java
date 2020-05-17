package kosta.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SelectController 요청되었습니다.");
		
		//request.setAttribute("message", "Select의 결과입니다."); // 스프링의 ModelAndView에서는 잘 쓰지 않는 표현
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult");
		mv.addObject("message", "Select의 결과입니다."); // 대신 이렇게 사용 //${message}로 불러올 수 있다.
		
		return mv;
	}

}
