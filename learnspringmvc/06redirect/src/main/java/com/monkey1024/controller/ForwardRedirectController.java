package com.monkey1024.controller;

import com.monkey1024.bean.School;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardRedirectController {

    @RequestMapping("/redirectMAV.do")
    public ModelAndView redirectMAV() throws Exception{

        ModelAndView mv = new ModelAndView();

        mv.addObject("type","返回ModelAndView的重定向");
        mv.addObject("schoolName","清华");
        mv.addObject("address","北京");

        mv.setViewName("redirect:other.do");

        return mv;
    }

    @RequestMapping("/forwardStr.do")
    public String forwardStr(Model model, School school) throws Exception{

        model.addAttribute("schoolName",school.getSchoolName());
        model.addAttribute("address",school.getAddress());

        return "redirect:/jsp/result.jsp";
    }
}
