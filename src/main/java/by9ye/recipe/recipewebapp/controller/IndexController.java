package by9ye.recipe.recipewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/index", "/"})
    public String getIndexPage() {
        System.out.println("adfda");
        return "index";
    }
}
