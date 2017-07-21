package com.feifan.housemanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.housemanage.form.HouseManageForm;

public class HouseManageDeleteConfirmExecuteParamBean {
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

	public void setValue(HouseManageForm form) {
		this.id = form.getId();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
