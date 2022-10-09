package vikas.RatanRaman;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DiaryController {
@RequestMapping("/diary")
public ModelAndView mainPage(HttpServletRequest request, HttpServletResponse response)
{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("DiaryMain.jsp");
	return mv;
			
}
}
