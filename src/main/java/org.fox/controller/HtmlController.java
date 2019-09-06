package org.fox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/",method = RequestMethod.GET)
public class HtmlController {
	@RequestMapping(value="/acceptlist",method = RequestMethod.GET)
	public String shopList() {
		//转发到店铺列表页面
		return "/acceptlist";
	}
}
