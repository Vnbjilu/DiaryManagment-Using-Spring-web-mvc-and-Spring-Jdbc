package vikas.RatanRaman;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/home")
	public ModelAndView indexPage(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("mainIndex.jsp");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login.jsp");
		return mv;
		
				
	}
	@RequestMapping("/login_do")
	public ModelAndView login_do(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		String userName=request.getParameter("userName");
		String password=request.getParameter("userPassword");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		UserDao us=context.getBean(UserDao.class);
		
		if(us.login(userName, password))
		mv.setViewName("mainIndex.jsp");
		else
			mv.setViewName("Failure.jsp");
		return mv;
	}

}
