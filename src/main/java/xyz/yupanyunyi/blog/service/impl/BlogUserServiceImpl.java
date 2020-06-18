package xyz.yupanyunyi.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yupanyunyi.blog.dao.BlogUserRepository;
import xyz.yupanyunyi.blog.model.entity.BlogUser;
import xyz.yupanyunyi.blog.service.BlogUserService;

import java.util.List;

/**
 * @author zhangzhe
 * @Description:
 * @Version 1.0.0
 */
@Service
public class BlogUserServiceImpl  implements BlogUserService {

    @Autowired
    private BlogUserRepository userRepository;

    @Override
    public List<BlogUser> findAllUser() {
        return userRepository.findAll();
    }
}
