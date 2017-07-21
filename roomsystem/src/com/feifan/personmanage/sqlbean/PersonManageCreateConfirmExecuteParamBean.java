package com.feifan.personmanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.personmanage.form.PersonManageForm;

public class PersonManageCreateConfirmExecuteParamBean {
	// ID
	private String id;
	// 身份证号
	private String person_num;
	// 姓名
	private String name;
	// 性别
	private String sex;
	// 藉贯
	private String native_place;
	// 公司
	private String work_place;
	// 电话
	private String telephone;
	// 邮件地址
	private String email;
	// 备注
	private String comment;
	// 操作员
	private String lastupdated_operator;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getWork_place() {
		return work_place;
	}

	public void setWork_place(String work_place) {
		this.work_place = work_place;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLastupdated_operator() {
		return lastupdated_operator;
	}

	public void setLastupdated_operator(String lastupdated_operator) {
		this.lastupdated_operator = lastupdated_operator;
	}

	public void setValue(PersonManageForm form) {
		this.person_num = form.getPerson_num();
		this.name = form.getName();
		this.sex = form.getSex();
		this.native_place = form.getNative_place();
		this.work_place = form.getWork_place();
		this.telephone = form.getTelephone();
		this.email = form.getEmail();
		this.comment = form.getComment();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
