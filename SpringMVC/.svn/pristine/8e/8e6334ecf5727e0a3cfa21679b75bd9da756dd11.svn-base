package cjp.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope(value="prototype")
@RequestMapping
public class HelloController {
	
	@RequestMapping(value="/sayHello")
	public String sayHello(Model model){
		model.addAttribute("word", "你好--Spring MVC 世界");
		return "helloWorld";
	}
	
	@RequestMapping(value="/test1")
	public String test1(Model model){
		model.addAttribute("word", "测试页面一");
		return "test1";
	}
	@RequestMapping(value="/test2")
	public String test2(Model model){
		model.addAttribute("word", "测试页面二");
		return "test2";
	}
}
