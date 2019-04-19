package bean;

import java.io.Serializable;

public class User implements Serializable {

    private String userid;
    private String username;
    private String userroom;
    private String userage;
    private String usergrade;

    public User(){ }

    public User(String userid,String username,String userroom,String userage,String usergrade){
        super();
        this.userid=userid;
        this.username=username;
        this.userroom=userroom;
        this.userage=userage;
        this.usergrade=usergrade;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUserroom() {
        return userroom;
    }

    public String getUserage() {
        return userage;
    }

    public String getUsergrade() {
        return usergrade;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserroom(String userroom) {
        this.userroom = userroom;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public void setUsergrade(String usergrade) {
        this.usergrade = usergrade;
    }

    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", userid=" + userid +
                ", userroom='" + userroom + '\'' +
                ", userage=" + userage +
                ", usergrade=" + usergrade +
                '}';
    }

}
