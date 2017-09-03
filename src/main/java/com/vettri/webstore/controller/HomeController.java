/**
 * 
 */
package com.vettri.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vettrivel
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public String welcome(Model model){
		model.addAttribute("greeting", "Welcome to the Web Store!");
		model.addAttribute("tagline", "The one and only amazing web store");
		return "welcome";
	}
}
