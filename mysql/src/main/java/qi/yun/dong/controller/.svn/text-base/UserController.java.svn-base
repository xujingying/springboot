package qi.yun.dong.controller;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import qi.yun.dong.entity.User;
import qi.yun.dong.service.UserSerivce;

/**
 * 
 * @author dongyunqi
 * @date 2017年9月6日上午10:06:06
 * @description
 */
@Controller
public class UserController {
	@Resource(name = "userSerivce")
	private UserSerivce userSerivce;

	@RequestMapping("/userList")
	public String userList(@PathParam(value = "name") String name, Model model) {
		System.out.println("name: " + name);
		User user = userSerivce.findByName(name);
		model.addAttribute("user", user);
		return "user/user_detail";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@PathParam(value = "name") String name, Model model) {
		System.out.println("name: " + name);
		User user = new User();
		user.setName(name);
		userSerivce.saveUser(user);
		return "redirect:/userList";
	}
}
