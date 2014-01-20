package nl.wulder.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(method = GET)
    public String index() {
        return "redirect:/page1";
    }

    @RequestMapping(value = "page1", method = GET)
    public String page1() {
        return "page1";
    }

    @RequestMapping(value = "page2", method = GET)
    public String page2() {
        return "page2";
    }
}
