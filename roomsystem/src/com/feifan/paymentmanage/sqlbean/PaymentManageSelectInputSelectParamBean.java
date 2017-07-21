package com.feifan.paymentmanage.sqlbean;

import com.feifan.paymentmanage.form.PaymentManageForm;

public class PaymentManageSelectInputSelectParamBean {
	// 姓名
	private String name;
	// 房间号码
	private String house_num;
	// 开始日期
	private String start_date;
	// 结束日期
	private String end_date;
	// 交租日期
	private String pay_date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHouse_num() {
		return house_num;
	}

	public void setHouse_num(String house_num) {
		this.house_num = house_num;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}

	public void setValue(PaymentManageForm form) {
		this.name = "%" + form.getName() + "%";
		this.house_num = "%" + form.getHouse_num() + "%";
		this.start_date = form.getStart_date();
		this.end_date = form.getEnd_date();
		this.pay_date = form.getPay_date();
	}
}
