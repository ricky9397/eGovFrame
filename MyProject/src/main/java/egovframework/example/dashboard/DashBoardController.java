package egovframework.example.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashBoardController {
	
	@RequestMapping(value = "/dashBoard.do")
	public String dashBoardView() throws Exception {
		return "dashboard/dashBoard";
	}
}
