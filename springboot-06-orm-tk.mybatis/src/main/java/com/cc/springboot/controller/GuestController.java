package com.cc.springboot.controller;

import com.cc.springboot.model.Guest;
import com.cc.springboot.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @authotr chencai
 * @createDate 2021/9/30
 */
@Controller
public class GuestController {

    @Autowired
    GuestService  guestService;

    @RequestMapping("getGuestList")
    public String  guestList(Model model){
        List<Guest> list = guestService.getList();
        model.addAttribute("guests",list);
        return   "guests";
    }
}
