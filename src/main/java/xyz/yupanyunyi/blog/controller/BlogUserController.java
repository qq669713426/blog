package xyz.yupanyunyi.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yupanyunyi.blog.model.entity.BlogUser;
import xyz.yupanyunyi.blog.service.BlogUserService;

import java.util.List;

/**
 * @author zhangzhe
 * @Description:
 * @Version 1.0.0
 */
@RestController
@RequestMapping("v1/user")
public class BlogUserController {

    @Autowired
    private BlogUserService userService;

    @RequestMapping("/findall")
    public List<BlogUser> fingAllUser() {
        return userService.findAllUser();
    }
}
