package com.feifan.personmanage.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectResultBean;

public class PersonManageForm extends ActionForm {
	private static final long serialVersionUID = 9153107880234388577L;
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

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if (null == person_num || person_num.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "身份证号"));
		} else if (!CommonUtility.isPerson_Num(person_num)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "身份证号"));
		} else if (null == name || name.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "姓名"));
		} else if (null == sex || sex.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "性别"));
		} else if (null == native_place || native_place.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "藉贯"));
		} else if (null == work_place || work_place.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "公司"));
		} else if (null == telephone || telephone.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "电话"));
		} else if (!CommonUtility.isTelephone(telephone)) {
			actionErrors.add("error", new ActionMessage("global_form_03", "电话"));
		} else if (null == email || email.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "邮件地址"));
		} else if (!CommonUtility.isEmail(email)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "邮件地址"));
		}
		return actionErrors;
	}

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

	public void setValue(PersonManageSelectInputSelectResultBean resultBean) {
		this.id = resultBean.getId();
		this.person_num = resultBean.getPerson_num();
		this.name = resultBean.getName();
		this.sex = resultBean.getSex();
		this.work_place = resultBean.getWork_place();
		this.native_place = resultBean.getNative_place();
		this.telephone = resultBean.getTelephone();
		this.email = resultBean.getEmail();
		this.comment = resultBean.getComment();
	}
}
