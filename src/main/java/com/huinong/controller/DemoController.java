package com.huinong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class DemoController {

    @GetMapping("index")
    public String index(ModelMap map){
        map.put("welcome","SpringBoot Hello World！");
        return "index";
    }


}
