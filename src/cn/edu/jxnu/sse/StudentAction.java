package cn.edu.jxnu.sse;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {
	private Student s1 = new Student();

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return s1;
	}
	
}
