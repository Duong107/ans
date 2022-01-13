package com.nguyenduong.dev.Main;

import com.nguyenduong.dev.DAO.UserDAO;
import com.nguyenduong.dev.Enity.*;

import java.util.ArrayList;
import java.util.Date;

public class TestAction {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
//        Users users = new Users(1,"nguyenduong","nguyenduong.dev","duognvhps17859@fpt.edu.vn","abc123",new Date(),new Date(),"null",new ArrayList<Video>(),new ArrayList<Comment>(),new ArrayList<Favorite>(),new ArrayList<UserSubcrible>(),new ArrayList<UserSubcrible>());
//        userDAO.SaveEntity(users);
        userDAO.selectAll().forEach(System.out::println);
    }
}
