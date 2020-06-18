package xyz.yupanyunyi.blog.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author zhangzhe
 * @Description:
 * @Version 1.0.0
 */
@NoRepositoryBean//表示不是Repository对象
public interface JpaBaseRepository <T> extends JpaRepository<T,Integer> , JpaSpecificationExecutor<T> {
}
