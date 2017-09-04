package com.spring.board;

import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.board.dto.MemberVO;
import com.spring.board.service.MemberService;
 
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @Autowired
    private MemberService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{
 
        logger.info("home");
        
        List<MemberVO> memberList = service.selectMember();
        
        model.addAttribute("memberList", memberList);
 
        return "home";
    }
    
    @RequestMapping(value="/addmember", method = RequestMethod.GET)
    public String addmember() {
    	return "addMember";
    }
    
    @RequestMapping(value="/addmember", method = RequestMethod.POST)
    public String addmember2(MemberVO membervo, @RequestParam String id, @RequestParam String pw, @RequestParam String name) {
    	
    	
    	membervo.setId(id);
    	membervo.setPw(pw);
    	membervo.setName(name);
    	
    	System.out.println("vo value test:"+membervo.toString());

    	
    	service.addMember(membervo);
    	return "redirect:/";
    }
    
    @RequestMapping(value="/remove", method = RequestMethod.POST)
    public String remove(MemberVO membervo, @RequestParam String id) {
    	
    	

    	membervo.setId(id);
    	
    	service.removeMember(membervo);
    	
    	
    	return "redirect:/";
    }
    
    @RequestMapping(value="/modifyMember", method=RequestMethod.GET)
    public String remove(Model model, @RequestParam String id, @RequestParam String pw, @RequestParam String name) {
    	
    	model.addAttribute("id",id);
    	model.addAttribute("pw",pw);
    	model.addAttribute("name",name);
    	
    	return "modifyMember";
    }
    
    @RequestMapping(value="/modifyMember", method=RequestMethod.POST)
    public String remove(MemberVO membervo, @RequestParam String id, @RequestParam String pw, @RequestParam String name) {
    	
    	membervo.setId(id);
    	membervo.setPw(pw);
    	membervo.setName(name);
    	
    	service.modifyMember(membervo);
    	
    	return "redirect:/";
    }
    
}


