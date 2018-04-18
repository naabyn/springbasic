package com.nabin.SpringSecurity.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class TestControler {

    @GetMapping(value = "/test")
    public String getTest(@AuthenticationPrincipal UserDetails userDetails){
        String curentUser=userDetails.getUsername();
        return "Inside Test";
    }

    @GetMapping(value = "/admin")
    public String getForAdmin(){
        return "Indise ADminMethod";
    }

}
