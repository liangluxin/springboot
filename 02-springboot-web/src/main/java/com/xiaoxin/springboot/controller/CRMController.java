package com.xiaoxin.springboot.controller;

import com.xiaoxin.springboot.model.BaseDict;
import com.xiaoxin.springboot.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CRMController {

    @Autowired
    private BaseDictService baseDictService;
    @RequestMapping("/customer/list")
    public String list(Model model) {
        List<BaseDict> fromType = baseDictService.selectBaseDictList("002");
        List<BaseDict> industryType = baseDictService.selectBaseDictList("001");
        List<BaseDict> levelType = baseDictService.selectBaseDictList("006");

        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

        return "customer";
/*@RequestMapping("/customer/list1")
    public String list1(){
        return "customer";*/
    }

    }

