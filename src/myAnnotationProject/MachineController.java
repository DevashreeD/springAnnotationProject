package myAnnotationProject;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/machine")
public class MachineController {

	@RequestMapping("/myForm")
	public String showForm(Model modelName) {
		
		modelName.addAttribute("MachineModel", new Machine());
		
		return "plot-form";
	}
	@RequestMapping("/processing")
	public String procesing(
			@Valid @ModelAttribute("MachineModel")  Machine theMachine,
			BindingResult theBindingResult) {
		
		System.out.println("Plotter Name is |" + theMachine.getPlotterName() + "|");
		
		if (theBindingResult.hasErrors()) {
			return "plot-form";
		}
		else {
			return "confirmation";
		}
	
	
	
	}}
