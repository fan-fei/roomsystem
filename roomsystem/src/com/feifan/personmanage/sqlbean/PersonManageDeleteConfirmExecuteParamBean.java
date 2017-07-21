package com.feifan.personmanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.personmanage.form.PersonManageForm;

public class PersonManageDeleteConfirmExecuteParamBean {
	// ID
	private String id;
	// 操作员
	private String lastupdated_operator;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastupdated_operator() {
		return lastupdated_operator;
	}

	public void setLastupdated_operator(String lastupdated_operator) {
		this.lastupdated_operator = lastupdated_operator;
	}

	public void setValue(PersonManageForm form) {
		this.id = form.getId();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
