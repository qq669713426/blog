package xyz.yupanyunyi.blog.service;

import xyz.yupanyunyi.blog.model.entity.BlogUser;

import java.util.List;

/**
 * @author zhangzhe
 * @Description:
 * @Version 1.0.0
 */
public interface BlogUserService {

    List<BlogUser> findAllUser();
}
