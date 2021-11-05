package egovframework.example.Employee.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.utils.RequestUtil;

@Controller	
public class EmployeeController {
	
	@RequestMapping(value = "login.do")
	public String loginView() throws Exception{
		return "employee/login";
	}
	
	
	@RequestMapping(value = "join.do")
	public String joinView(HttpServletRequest request) throws Exception{
		Map<String, Object> inOutMap = RequestUtil.getParameterMap(request);
		return "employee/join";
	}
	
	
}
