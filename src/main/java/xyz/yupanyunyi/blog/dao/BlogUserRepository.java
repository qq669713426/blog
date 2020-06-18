package xyz.yupanyunyi.blog.dao;

import xyz.yupanyunyi.blog.common.JpaBaseRepository;
import xyz.yupanyunyi.blog.model.entity.BlogUser;

import java.util.List;

/**
 * @author zhangzhe
 * @Description:
 * @Version 1.0.0
 */
public interface BlogUserRepository extends JpaBaseRepository<BlogUser> {
    /**
    *
    * @Description: 
    * @author zhangzhe
    */
    
    @Override
    List<BlogUser> findAll();
}
