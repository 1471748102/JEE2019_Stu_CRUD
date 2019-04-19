package dao;

public interface StuDAO {
    boolean inter(String username,String password) throws Exception;
    int add(String userid,String username,String userroom,String userage,String usergrade) throws Exception;
}
