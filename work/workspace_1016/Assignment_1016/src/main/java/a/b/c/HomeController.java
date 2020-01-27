package a.b.c;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		// -> request.setAttribute ������
		// -> key / value�� Object Type�� �� �� �ִ�
		
		return "home";
		 // -> WEB-INF/views/home
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	                                       //-> RequestMethod.POST 
	public String login(Locale locale, Model model) {
		logger.info("Welcome to login page! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		return "login";
	}
	
	@RequestMapping(value = "empList", method = RequestMethod.GET)
	public String empList(Locale locale, Model model) {
		logger.info("Welcome to empList page! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "empList";
	}
	
	@RequestMapping(value = "/a", method = RequestMethod.GET)
						// ->�̷��� �ϸ� a.jsp�� ȣ����
	public void sample() {
		
		
	}
	
	
}