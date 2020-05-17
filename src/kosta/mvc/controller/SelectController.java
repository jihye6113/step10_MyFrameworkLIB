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
		System.out.println("SelectController ��û�Ǿ����ϴ�.");
		
		//request.setAttribute("message", "Select�� ����Դϴ�."); // �������� ModelAndView������ �� ���� �ʴ� ǥ��
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult");
		mv.addObject("message", "Select�� ����Դϴ�."); // ��� �̷��� ��� //${message}�� �ҷ��� �� �ִ�.
		
		return mv;
	}

}
