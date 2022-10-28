package org.sky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    public HelloController(){
        System.out.println("*******************************");
        System.out.println("\n \n Front controller calling! \n \n");
        System.out.println("*******************************");
    }

    @RequestMapping("/")
    public String display() {
        System.out.println("*******************************");
        System.out.println("\n \n Came here and return the test jsp page! \n \n");
        System.out.println("*******************************");
        return "test";
    }

    @RequestMapping("/test")
    String index() {
        //mapped to hostname:port/home/index/
        System.out.println("*******************************");
        System.out.println("\n \n Came here and return the test jsp page 2 \n \n");
        System.out.println("*******************************");
        return "test";
    }

}