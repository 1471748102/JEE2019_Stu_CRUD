package dao;



import java.sql.*;


public class StuDAOImp implements StuDAO{
    String url="jdbc:hsqldb:hsql://localhost/testdbname";
    String driver = "org.hsqldb.jdbcDriver";
    String user="sa";
    String pass="";

    public boolean inter(String username, String password) throws Exception {

        boolean flag = false;
        Class.forName(driver);
        String sql="select * from stulogin where username=? and password =?";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt=con.prepareStatement(sql)){
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            try(ResultSet rs=pstmt.executeQuery()){
                flag=rs.next();
            }
        }
        return flag;
    }

    String urls="jdbc:hsqldb:hsql://localhost/stumessage";
    String drivers = "org.hsqldb.jdbcDriver";
    String users="sa";
    String passs="";

    public int add(String userid,String username,String userroom,String userage,String usergrade) throws Exception{

        int flags = 0;
        Class.forName(drivers);
        String sql = "insert into student VALUES(?,?,?,?,?)";
        //  String sql = "insert into student VALUES('A004','张飞','S004',18,92)";
        try{
            Connection con = DriverManager.getConnection(urls, users, passs);
            PreparedStatement pres=con.prepareStatement(sql);

            pres.setString(1,userid);
            pres.setString(2,username);
            pres.setString(3,userroom);
            pres.setString(4,userage);
            pres.setString(5,usergrade);
            pres.execute();

            flags=pres.executeUpdate(sql);
            System.out.println("插入"+flags+"条数据");

        }

        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return flags;
    }



}
