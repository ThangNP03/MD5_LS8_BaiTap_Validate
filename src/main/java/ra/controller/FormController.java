package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.model.User;
import ra.service.IUserService;

@Controller
public class FormController {
    @Autowired
    private IUserService userService;
    @GetMapping("/")
    public String showIndex(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/register")
    public String doRegister(@Validated @ModelAttribute User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "index";
        }
        model.addAttribute("user", userService.save(user));
        return "result";
    }
}
