package com.feifan.paymentmanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.paymentmanage.form.PaymentManageForm;

public class PaymentManageDeleteConfirmExecuteParamBean {
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

	public void setValue(PaymentManageForm form) {
		this.id = form.getId();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
