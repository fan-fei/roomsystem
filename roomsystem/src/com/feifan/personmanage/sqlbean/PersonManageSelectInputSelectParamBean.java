package com.feifan.personmanage.sqlbean;

import com.feifan.personmanage.form.PersonManageForm;

public class PersonManageSelectInputSelectParamBean {
	// 身份证号
	private String person_num;
	// 姓名
	private String name;
	// 性别
	private String sex;
	// 藉贯
	private String native_place;

	public String getPerson_num() {
		return person_num;
	}

	public void setPerson_num(String person_num) {
		this.person_num = person_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNative_place() {
		return native_place;
	}

	public void setNative_place(String native_place) {
		this.native_place = native_place;
	}

	public void setValue(PersonManageForm form) {
		this.person_num = "%" + form.getPerson_num() + "%";
		this.name = "%" + form.getName() + "%";
		this.native_place = "%" + form.getNative_place() + "%";
		this.sex = "%" + form.getSex() + "%";
	}
}
