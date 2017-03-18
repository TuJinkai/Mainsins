package cn.edu.jxnu.sse;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {
    private Student s;
    
    
	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		return SUCCESS;
	}
	
	public String go() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	} 
}
