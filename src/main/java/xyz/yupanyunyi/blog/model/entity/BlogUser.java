package xyz.yupanyunyi.blog.model.entity;


import lombok.Data;

import javax.persistence.*;

/**
*
* @Description:
 * id              int(20) auto_increment comment '主键'
 *         primary key,
 *     user_ip         varchar(20)  not null comment 'ip',
 *     user_name       varchar(20)  not null comment '用户名',
 *     user_pwd        varchar(20)  not null comment '密码',
 *     user_email      varchar(30)  not null comment '邮箱',
 *     user_image      varchar(255) not null comment '头像',
 *     user_creat_time datetime     null comment '创建时间',
 *     user_birthday   date         null comment '生日',
 *     user_age        int(4)       null comment '年龄',
 *     user_telephone  int(100)     not null comment '电话',
 *     user_nikename   varchar(20)  not null comment '昵称'
* @author zhangzhe
*/

@Data
@Table(name = "blog_user")
@Entity
public class BlogUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
  @Column(name = "id")
  private Integer id;
  @Column(name = "user_ip")
  private String userIp;
  @Column(name = "user_name")
  private String userName;
  @Column(name = "user_pwd")
  private String userPwd;
  @Column(name = "user_email")
  private String userEmail;
  @Column(name = "user_image")
  private String userImage;
  @Column(name = "user_creat_time")
  private java.sql.Timestamp userCreatTime;
  @Column(name = "user_birthday")
  private java.sql.Date userBirthday;
  @Column(name = "user_age")
  private Integer userAge;
  @Column(name = "user_telephone")
  private Integer userTelephone;
  @Column(name = "user_nikename")
  private String userNikename;



}
