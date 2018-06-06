package com.securityLab.securityLab;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.securityLab.securityLab.dao.UsersRepository;
import com.securityLab.securityLab.dao.userDao;

@Controller
@SessionAttributes("userEmail")
public class HomeController {

	@Autowired
	private userDao userDao;

//	@Autowired
//	UsersRepository uR;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(HttpSession session, Model model, @RequestParam("email") String email,
			@RequestParam("password") String password) {
	
	
		// System.out.println(uR.findById(email));
		// Optional<Users> u1 = uR.findById(email);
		
		
		if (userDao.findUser(email) != null) {

			if (userDao.checkUser(email, password)) {
			
				model.addAttribute("userEmail", email);
				return new ModelAndView("welcome", "message", "Welcome,enjoy your coffee");
			} else {
				return new ModelAndView("loginfailed");
			}
		}else {
			
			model.addAttribute("userEmail", "");
			System.out.println();
			return new ModelAndView("welcome", "message", "The user is not exist");
		}
	}
}
