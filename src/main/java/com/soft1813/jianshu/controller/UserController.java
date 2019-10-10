package com.soft1813.jianshu.controller;

import cn.hutool.db.Entity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.soft1813.jianshu.dao.UserDao;
import com.soft1813.jianshu.factory.DaoFactory;
import com.soft1813.jianshu.utils.ResponseObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zh_yan
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/10/10
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/api/users")
public class UserController extends HttpServlet {
    private UserDao userDao = DaoFactory.getUserDaoInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("application/json;charset=utf-8");
        List<Entity> userList = null;
        try{
            userList = userDao.findAll();
        }catch (SQLException e){
            e.printStackTrace();
        }
        ResponseObject ro = new ResponseObject();
        ro.setCode(resp.getStatus());
        if(resp.getStatus()==200){
            ro.setMsg("请求成功");
        }else {
            ro.setMsg("请求失败");
        }
        ro.setData(userList);
        Gson gson = new GsonBuilder().create();
        PrintWriter out = resp.getWriter();
        out.print(gson.toJson(ro));
        out.close();
    }




}
