package kr.ac.yeongnam.day15;

import java.io.Serializable;

public class UserVO implements Serializable{

	public String 	name;
	public int		age;
	public String	phone;
	public String	addr;
	/**
	 * @param name
	 * @param age
	 * @param phone
	 * @param addr
	 */
	
	public UserVO(String name, int age, String phone, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + ", phone=" + phone + ", addr=" + addr + "]";
	}
	
	
	
}
