package com.soft1813.jianshu.factory;

import com.soft1813.jianshu.dao.UserDao;
import com.soft1813.jianshu.dao.impl.UserDaoImpl;

/**
 * @author zh_yan
 * @ClassName DaoFactory
 * @Description TODO
 * @Date 2019/10/10
 * @Version 1.0
 **/
public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }
}
