package com.jude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 首页或者权限url跳转控制器
 * @author jude
 *
 */
@Controller
public class IndexController {

	
    /**
     * 网站根目录请求
     * @return
     */
    @RequestMapping("/")
    public String root() {
    	return "redirect:/login.html";
    }


    public static void main(String[] args) {


            String s = "2019-12-30 12:52:02";

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date date = null;
        try {
             date = format.parse(s);
             System.out.println("字符串格式时间转时间格式："+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

            String time = format.format(date.getTime());

            System.out.println("格式化结果：" + time);

        Date date1 = new Date();
        System.out.println(date1);

    }
}
