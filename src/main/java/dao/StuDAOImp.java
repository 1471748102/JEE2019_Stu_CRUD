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
}
