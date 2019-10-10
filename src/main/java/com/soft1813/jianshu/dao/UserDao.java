package com.soft1813.jianshu.dao;

import cn.hutool.db.Entity;
import com.soft1813.jianshu.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zh_yan
 * @ClassName UserDao
 * @Description 用户数据接口
 * @Date 2019/10/8
 * @Version 1.0
 **/
public interface UserDao {

    /**
     * 查询所有用户
     * @return
     * @throws SQLException
     */
      List<Entity> findAll() throws SQLException;
}
