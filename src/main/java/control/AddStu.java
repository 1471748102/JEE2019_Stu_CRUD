package control;

import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;


public class AddStu extends ActionSupport {

    private String userid;
    private String username;
    private String userroom;
    private String userage;
    private String usergrade;

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

    public String execute() throws Exception {
        StuDAO stu1 = new StuDAOImp();
        int flags = stu1.add(getUserid(),getUsername(),getUserroom(),getUserage(),getUsergrade());
        if(flags==0)
            return SUCCESS;
        else
            return ERROR;
    }
}

