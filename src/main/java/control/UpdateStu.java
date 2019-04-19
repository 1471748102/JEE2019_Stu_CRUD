package control;


import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;

public class UpdateStu extends ActionSupport {

    private String userid;
    private User uuu;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public User getUuu() {
        return uuu;
    }

    public void setUuu(User uuu) {
        this.uuu = uuu;
    }

    public String execute() throws Exception {

        boolean isSuc = false;
        StuDAO stu = new StuDAOImp();
        try {
            isSuc = stu.update(uuu);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuc? SUCCESS : ERROR;

    }

}

