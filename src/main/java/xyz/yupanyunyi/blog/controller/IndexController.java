package xyz.yupanyunyi.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangzhe
 * @Description:
 * @Version 1.0.0
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @ResponseBody
    @RequestMapping("hello")
    public String test(){
        return "helloWord";
    }
}
