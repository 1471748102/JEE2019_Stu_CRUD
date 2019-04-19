package dao;



import bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StuDAOImp implements StuDAO {
    String url = "jdbc:hsqldb:hsql://localhost/testdbname";
    String driver = "org.hsqldb.jdbcDriver";
    String user = "sa";
    String pass = "";

    public boolean inter(String username, String password) throws Exception {

        boolean flag = false;
        Class.forName(driver);
        String sql = "select * from stulogin where username=? and password =?";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                flag = rs.next();
            }
        }
        return flag;
    }

    String urls = "jdbc:hsqldb:hsql://localhost/stumessage";
    String drivers = "org.hsqldb.jdbcDriver";
    String users = "sa";
    String passs = "";

    public int add(String userid, String username, String userroom, String userage, String usergrade) throws Exception {

        int flags = 0;
        Class.forName(drivers);
        String sql = "insert into student VALUES(?,?,?,?,?)";
        //  String sql = "insert into student VALUES('A004','张飞','S004',18,92)";
        try {
            Connection con = DriverManager.getConnection(urls, users, passs);
            PreparedStatement pres = con.prepareStatement(sql);

            pres.setString(1, userid);
            pres.setString(2, username);
            pres.setString(3, userroom);
            pres.setString(4, userage);
            pres.setString(5, usergrade);
            pres.execute();

            flags = pres.executeUpdate(sql);
            System.out.println("插入" + flags + "条数据");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return flags;
    }

    String urlt = "jdbc:hsqldb:hsql://localhost/stumessage";
    String drivert = "org.hsqldb.jdbcDriver";
    String usert = "sa";
    String passt = "";

    public User mlz(User uk) throws Exception {

        Class.forName(drivert);
        String sql = "insert into student VALUES(?,?,?,?,?)";
        try {
            Connection con = DriverManager.getConnection(urlt, usert, passt);
            PreparedStatement pret = con.prepareStatement(sql);

            pret.setString(1, uk.getUserid());
            pret.setString(2, uk.getUsername());
            pret.setString(3, uk.getUserroom());
            pret.setString(4, uk.getUserage());
            pret.setString(5, uk.getUsergrade());
            pret.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return uk;

    }


    String urlf = "jdbc:hsqldb:hsql://localhost/stumessage";
    String driverf = "org.hsqldb.jdbcDriver";
    String userf = "sa";
    String passf = "";

    public List show() throws Exception {
        List StudentList = new ArrayList();
        Class.forName(drivert);
        String sql = "select * from student";
        try {
            Connection con = DriverManager.getConnection(urlf, userf, passf);
            PreparedStatement pref = con.prepareStatement(sql);
            ResultSet rs = pref.executeQuery();
            while (rs.next()) {
                User uk = new User();
                uk.setUserid(rs.getString("userid"));
                uk.setUsername(rs.getString("username"));
                uk.setUserroom(rs.getString("userroom"));
                uk.setUserage(rs.getString("userage"));
                uk.setUsergrade(rs.getString("usergrade"));
                StudentList.add(uk);
            }
            return StudentList;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return StudentList;

    }

    String urlv = "jdbc:hsqldb:hsql://localhost/stumessage";
    String driverv = "org.hsqldb.jdbcDriver";
    String userv = "sa";
    String passv = "";

    public boolean delete(String xuehao) throws Exception {
        boolean isSuc = false;
        String sql = "delete from student where userid = ?";
        Class.forName(driver);
        try (Connection con = DriverManager.getConnection(urlv, userv, passv);
             PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, xuehao);
            int row = pstmt.executeUpdate();
            if (row > 0) {
                isSuc = true;
            }
        }
        return isSuc;
    }
/*

    String urls6 = "jdbc:hsqldb:hsql://localhost/stumessage";
    String drivers6 = "org.hsqldb.jdbcDriver";
    String users6 = "sa";
    String passs6 = "";


    public boolean update(String xuehao) throws Exception {



        return true;

    }
   */
}

