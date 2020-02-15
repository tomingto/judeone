package com.jude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


          /*  String s = "2019-12-30 12:52:02";

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
        System.out.println(date1);*/


    /*    double total;
        for (int n = 0; n <100 ; n++) {
            if(n%5 == 1){
                total = n+(3*n-1)*0.1-0.1;
            }else{
                total = n+(3*n-1)*0.1;
            }
            System.out.println("n="+n+"结果为"+ total);
        }*/

        double total1 =0;
        int m = 1;
        for (int n = 0; n <100 ; n++) {
            if(n%5 == 1){
                m ++;
            }
            total1 = n+(3*n-1)*0.1-0.1*m;
            System.out.println("m=="+m);
            System.out.println("n="+n+"结果为"+ total1);
        }
      /*  double a=0;
        for (int j = 1; j <100 ; j++) {
            if (j == 1){
                a = 1.2;
            }
            else if(j%5 == 1 && j !=1 ){
                 a = 1.2*j+0.1*j-0.1-0.1;
            }else{
                 a = 1.2*j+0.1*j-0.1;
            }
            System.out.println("j=="+j+"a=="+a);
        }*/

    }

}
