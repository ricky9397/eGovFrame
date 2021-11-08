package egovframework.example.Employee.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.Employee.service.EmployeeService;
import egovframework.example.utils.CommUtils;

@Controller	
public class EmployeeController {
	
	/** 사원 service */
	@Resource(name = "employeeService")
	private EmployeeService employeeService;
	
	@RequestMapping(value = "login.do")
	public String loginView() throws Exception{
		return "employee/login";
	}
	
	@RequestMapping(value = "join.do",  method = RequestMethod.POST )
	public String joinView(HttpServletRequest request) throws Exception{
		Map<String, Object> inOutMap = CommUtils.getFormParam(request);
		
		return "employee/join";
	}
	
	
}
