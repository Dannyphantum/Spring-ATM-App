package springATM;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springATM.ATMUser;
import springATM.BankUserRepository;

@Controller
public class ATMController {
	@Autowired //This annotation calls the bean BankUserRepository
	private BankUserRepository repository;
	
	@GetMapping("/main") //NEEDS COMMENT
	public String userStart(Model ATMUserModel){
		ATMUserModel.addAttribute("main", new ATMUser());
		return "main";
	}
	
	@PostMapping("/main") //Posts the input from form to database, then pushes user to next template
	public String userTranaction(@Valid ATMUser user, BindingResult resultThatBinds, Model m){
		 System.out.println(resultThatBinds.toString());
		if(resultThatBinds.hasErrors()){
			return "main";
		}
		
		repository.save(user);
		m.addAttribute("main",user);
		return "transaction";
	}

}
