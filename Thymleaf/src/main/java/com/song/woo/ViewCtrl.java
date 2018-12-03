package com.song.woo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewCtrl {
	@GetMapping("/index.do")
	public String index(Model model, HttpSession session) {
		model.addAttribute("a", "서버에서 값 조회");
		Map<String, String>user = new HashMap<String, String>();
		user.put("firstName", "first");
		user.put("LastName", "Last");
		session.setAttribute("session", user);
		return "index";
	}
}
