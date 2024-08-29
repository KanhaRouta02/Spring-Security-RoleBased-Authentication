package in.kanha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	//admin can access admin() and user()
	@GetMapping(value = "/admin")
	public String admin()
	{
		return "<h3> Welcome Admin..💗<h3>";
	}
	
	//user can access user()
	@GetMapping(value = "/user")
	public String user()
	{
		return "<h3> Welcome User..💗<h3>";
	}
	
	
	//any body can access
	@GetMapping(value = "/welcome")
	public String welcome()
	{
		return "<h3> Welcome ..💗<h3>";
	}
}
