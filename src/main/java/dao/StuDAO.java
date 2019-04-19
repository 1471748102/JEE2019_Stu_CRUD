package dao;

import bean.User;

public interface StuDAO {
    boolean inter(String username,String password) throws Exception;
    int add(String userid,String username,String userroom,String userage,String usergrade) throws Exception;
    User mlz(User uk) throws Exception;
}
