package myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import model.ProductModel;
import DAOController.ProductDAO;
import com.google.gson.Gson;


@Controller
public class ControllerFile 
{
	String message = "Welcome ! ";
	String setName = ""; 
	
	@RequestMapping("/loginValidate")
	public ModelAndView showMessage(
			@RequestParam(value = "usr", required = false, defaultValue = "World") String usr, 
			@RequestParam(value = "pwd", required = false, defaultValue = "") String pwd ) {
		
		System.out.println("in controller");
 
		ModelAndView mv = null;
		
		if("NIIT".equals(usr) && "NIIT".equals(pwd)){
		mv = new ModelAndView("success");
		mv.addObject("message", message);
		mv.addObject("name", usr);
		}
		return mv;
	}
	
	@RequestMapping("/registerValidate")
	public ModelAndView showRegMessage(
			@RequestParam(value = "user", required = false, defaultValue = "World") String user, 
			@RequestParam(value = "pword", required = false, defaultValue = "") String pword,
			@RequestParam(value = "email", required = false, defaultValue = "") String email,
			@RequestParam(value = "mobile", required = false, defaultValue = "") String mobile)
	{
		String regSuccess = "Registration Successful..";
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("message", message);
		mv.addObject("name",regSuccess);
		return mv;		
	}
	
	@RequestMapping("/productsInfo")
	public ModelAndView showProducts(
			@RequestParam(value = "name", required = false, defaultValue = "img") String name)
	{
		ModelAndView mv = null;
		setName = name;
		
		mv = new ModelAndView("GsonConvert");			  
		
		/*
		if("img1".equals(name)){
			mv = new ModelAndView("GsonConvert");			  
			return mv;
		}
		if("img2".equals(name)){
			mv = new ModelAndView("GsonConvert");			  
			return mv;
		}
		if("img3".equals(name)){
			mv = new ModelAndView("GsonConvert");			  
			return mv;
		}
		if("all".equals(name)){
			mv = new ModelAndView("GsonConvert");			  
			return mv;
		}
		*/
		return mv;
	}


	List<ProductModel> list = null;
	
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()
	{
		ProductDAO dao = new ProductDAO();
		
		if(setName.equals("img1") || setName.equals("img2") || setName.equals("img3")){
			list = dao.getProduct(setName);	
		}
		if(setName.equals("all")){			
			list = dao.getAllProducts();
		}
		
		Gson gson = new Gson();
		  
		String result = gson.toJson(list);
		
		return result;
	}


	
	@RequestMapping("/login")
	public ModelAndView showLogin()
	{
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView showRegister()
	{
		ModelAndView mv = new ModelAndView("Register");
		return mv;
	}
	
	@RequestMapping("/MoreInfo")
	public ModelAndView showMoreInfo()
	{
		ModelAndView mv = new ModelAndView("MoreInformation");
		return mv;
	}
}