package myAnnotationProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyHomeController {
	
@RequestMapping("/")
		public String MyPage(){
			return "main-file";
		}
		
	}

