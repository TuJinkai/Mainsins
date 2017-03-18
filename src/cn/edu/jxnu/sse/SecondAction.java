package cn.edu.jxnu.sse;

import java.util.Map;

import javax.servlet.http.HttpServletRequest; 

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SecondAction extends ActionSupport implements RequestAware {
    private Map req ;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		req = request;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		 
		
		req.get("username");
		return SUCCESS;
	}
}
