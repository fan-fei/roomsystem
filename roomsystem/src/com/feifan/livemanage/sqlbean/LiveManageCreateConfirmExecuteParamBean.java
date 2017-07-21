package com.feifan.livemanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.livemanage.form.LiveManageForm;

public class LiveManageCreateConfirmExecuteParamBean {
	// 人员ID
	private String person_id;
	// 房间ID
	private String house_id;
	// 床位号码
	private String bed_num;
	// 迁入时间
	private String enter_date;
	// 备注
	private String comment;
	// 操作员
	private String lastupdated_operator;

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}

	public String getHouse_id() {
		return house_id;
	}

	public void setHouse_id(String house_id) {
		this.house_id = house_id;
	}

	public String getBed_num() {
		return bed_num;
	}

	public void setBed_num(String bed_num) {
		this.bed_num = bed_num;
	}

	public String getEnter_date() {
		return enter_date;
	}

	public void setEnter_date(String enter_date) {
		this.enter_date = enter_date;
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

	public void setValue(LiveManageForm form) {
		this.person_id = form.getPerson_id();
		this.house_id = form.getHouse_id();
		this.bed_num = form.getBed_num();
		this.enter_date = form.getEnter_date();
		this.comment = form.getComment();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
