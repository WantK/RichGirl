package com.mooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
/*
@Controller+@ResponseBody=@RestControllers
 */
@RestController
@RequestMapping("/hello")

public class HelloController {
    @Autowired
    private LimitConfig limitConfig;
    @GetMapping("/say")
    //@RequestMapping(value="/hello",method= RequestMethod.GET)
    public String say(@RequestParam(value="id",required = false,defaultValue = "0")Integer id){
        return "id:"+id;
        //return "说明："+limitConfig.getDescription();


    }
}
