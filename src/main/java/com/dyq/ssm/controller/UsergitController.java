package com.dyq.ssm.controller;

import com.dyq.ssm.pojo.Usergit;
import com.dyq.ssm.service.UsergitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
/**
 * Created by 95312 on 2016/12/28.
 */
@Controller
@RequestMapping("/usergit")
public class UsergitController {
    //service类
    @Autowired
    private UsergitService usergitService;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/findUsergit" , method = RequestMethod.GET)
    private ModelAndView findUsergit()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("=============sdfghjk");
        //调用service方法得到用户列表
        List<Usergit> usergits = usergitService.findUsergit();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("usergits",usergits);
        //设置响应的jsp视图
        modelAndView.setViewName("findUsergit");

        return modelAndView;
    }
}
