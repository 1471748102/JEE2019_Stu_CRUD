package control;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;

public class AddStuByUser extends ActionSupport {
    private User uk;
    private User us;

    public User getUk() {
        return uk;
    }

    public void setUk(User uk) {
        this.uk = uk;
    }

    public String execute() throws Exception {
        StuDAO stu2 = new StuDAOImp();
        us =stu2.mlz(uk);
        return SUCCESS;
    }
}

