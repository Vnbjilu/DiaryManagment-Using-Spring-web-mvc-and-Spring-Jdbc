package vikas.RatanRaman;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

@RequestMapping("/RecordCreation")
public ModelAndView recordCreation(HttpServletRequest request, HttpServletResponse response)
{
	ModelAndView mv=new ModelAndView();
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	DiaryDao dd=context.getBean(DiaryDao.class);
	Diary diary=context.getBean(Diary.class);
	diary.setPersonName(request.getParameter("personName"));
	diary.setPersonEmail(request.getParameter("personEmail"));
	diary.setPersonContact(request.getParameter("personContact"));
	diary.setPersonAddress(request.getParameter("personAddress"));
	dd.insert(diary);
	mv.setViewName("diaryDisplay");
	return mv;
			
}
@RequestMapping("/diaryCreate")
public ModelAndView recordfrm(HttpServletRequest request,HttpServletResponse response)
{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("RecordCreation.jsp");
	return mv;
	
}
@RequestMapping("/diaryDisplay")
public ModelAndView diaryDisplay(HttpServletRequest request,HttpServletResponse response)
{
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
DiaryDao dd=context.getBean(DiaryDao.class);
//Diary diary=context.getBean(Diary.class);
List<Diary> diary=dd.getAllRecord();
ModelAndView mv=new ModelAndView();
mv.addObject("diary", diary);
mv.setViewName("displayDiaryRecord.jsp");
return mv;
}
}
