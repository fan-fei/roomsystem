package com.feifan.livemanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.livemanage.form.LiveManageForm;

public class LiveManageModifyConfirmExecuteParamBean {
	// ID
	private String id;
	// 床位号码
	private String bed_num;
	// 迁入日期
	private String enter_date;
	// 备注
	private String comment;
	// 最后操作帐号
	private String lastupdated_operator;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		this.id = form.getId();
		this.bed_num = form.getBed_num();
		this.enter_date = form.getEnter_date();
		this.comment = form.getComment();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
