package control;

import bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;

import java.util.List;


public class ShowAllStudent extends ActionSupport {


    private List<User> StudentList;

    public List<User> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<User> studentList) {
        StudentList = studentList;
    }


    public String execute() throws Exception {
        StuDAO stu3 = new StuDAOImp();
        StudentList=stu3.show( );

        for (User ux:StudentList) {
            System.out.println(ux);
        }
        ActionContext.getContext().put("StudentList",StudentList);
        return SUCCESS;
    }
}
