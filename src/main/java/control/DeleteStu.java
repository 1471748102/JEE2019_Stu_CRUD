package control;


import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;

public class DeleteStu extends ActionSupport {

    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }




    public String execute() throws Exception {

        boolean isSuc = false;
                StuDAO stu = new StuDAOImp();
               try {
                   isSuc = stu.delete(userid);
                  } catch (Exception e) {
                       e.printStackTrace();
                 }
        return isSuc? SUCCESS : ERROR;

                 }

}

