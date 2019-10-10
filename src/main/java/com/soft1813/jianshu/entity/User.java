package com.soft1813.jianshu.entity;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author mq_xu
 * @ClassName User
 * @Description 用户实体类
 * @Date 2019/10/08
 * @Version 1.0
 **/
@Data
public class User {
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;
    private String address;
    private LocalDate joinDate;
    private String description;
}
