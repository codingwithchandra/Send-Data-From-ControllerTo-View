package com.coding_with_chandra;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@GetMapping("/send")
	public ModelAndView SendDataFromControllerToJsp(ModelMap map) {
		
		ModelAndView mv = new ModelAndView();
		
		String msg ="Welcome to coding with chandra";
		
		mv.setViewName("index");
		List<String> list = Arrays.asList("chandra","nityansh","anand");
		
		map.addAttribute("mymsg", msg);
		map.addAttribute("mylist", list);
		
		return mv;
	}

}
