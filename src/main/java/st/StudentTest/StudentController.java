package st.StudentTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	

	@RequestMapping("/home")
	public String home() {
		return "Home.jsp";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome(Student std) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("std", std);
		mv.setViewName("Welcome.jsp");
		return mv;
	}
}
