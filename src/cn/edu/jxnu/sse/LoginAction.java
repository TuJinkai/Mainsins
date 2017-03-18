package cn.edu.jxnu.sse;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private double a;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request  = ServletActionContext.getRequest();
		System.out.print(request.getParameter("username"));
		if(username.equals("root")&&password.equals("admin"))
			return SUCCESS;
		else {
			return LOGIN;
		} 
	}
}
