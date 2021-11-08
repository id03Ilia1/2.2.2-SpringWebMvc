package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CountCars;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Cars {
    @GetMapping(value = "/cars")
    public String CarsWelcome(@RequestParam(value = "count", required = false) String scount, ModelMap modelMap) {

        List<web.model.Cars> carsmes = new ArrayList<>();
        int count;
        if (scount == null){
            count = 0;
        }else{
            count = Integer.parseInt(scount);
        }
        carsmes = new CountCars().countCarsint(count);

        modelMap.addAttribute("messages", carsmes);
        return "cars";
    }
}
