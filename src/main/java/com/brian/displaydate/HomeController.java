package com.brian.displaydate;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	// 1. Annotation
    @RequestMapping("/time")
    // 3. Method that maps to the request route above
    public String home() { // 3
            return "Time.jsp";
    }
    
    @RequestMapping("/date")
    public String date() {
    	return "Date.jsp";
    }
}
