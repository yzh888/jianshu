package com.soft1813.jianshu.dao;

import cn.hutool.db.Entity;
import com.soft1813.jianshu.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class UserDaoTest {
    private UserDao userDao= DaoFactory.getUserDaoInstance();

    @Test
    public void selectAll()throws SQLException {
        List<Entity> entityList = userDao.findAll();
        entityList.forEach(System.out::println);
    }

    @Test
    public void deleteUserById(){

    }
}