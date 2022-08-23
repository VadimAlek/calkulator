package CalculateAplication.controller;

import CalculateAplication.servise.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calkulator")

public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(calculateService calculateService) {
        this.calculateService = calculateService;
    }

    public String hello(){
        return "Добро пожаловать!";
    }

@GetMapping("/plus")
    public String plus(@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b){
    if (a==null || b==null)
        return "Одно из полей не передано.";
        int result = calculateService.plus (a,b);
    return a + "+"+b+"="+result;

    }

    @GetMapping("/minus")
    public String minus (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b){
        if (a==null || b==null)
            return "Одно из полей не передано.";
        int result = calculateService.minus (a,b);
        return a + "+"+b+"="+result;

    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b){
        if (a==null || b==null)
            return "Одно из полей не передано.";
        int result = calculateService.multiply (a,b);
        return a + "+"+b+"="+result;

    }

    @GetMapping("/divide")
    public String divide (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b){
        if (a==null || b==null)
            return "Одно из полей не передано.";
        if (b==0)
            return "На ноль делить нельзя.";
        double result = calculateService.divide (a,b);
        return a + "+"+b+"="+result;

    }

}
