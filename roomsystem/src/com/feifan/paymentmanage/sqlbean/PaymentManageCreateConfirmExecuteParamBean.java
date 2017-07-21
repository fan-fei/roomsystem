package com.feifan.paymentmanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.paymentmanage.form.PaymentManageForm;

public class PaymentManageCreateConfirmExecuteParamBean {
	// 住宿ID
	private String live_id;
	// 交租日期
	private String pay_date;
	// 开始日期
	private String start_date;
	// 结束日期
	private String end_date;
	// 租金
	private String room_rent;
	// 水费
	private String water_charge;
	// 电费
	private String power_charge;
	// 杂费
	private String extra_charge;
	// 网费
	private String cable_charge;
	// 暖费
	private String heating_charge;
	// 合计
	private String total_charge;
	// 房间押金
	private String room_deposit;
	// 备注
	private String comment;
	// 操作员
	private String lastupdated_operator;

	public String getLive_id() {
		return live_id;
	}

	public void setLive_id(String live_id) {
		this.live_id = live_id;
	}

	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
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

	public String getRoom_rent() {
		return room_rent;
	}

	public void setRoom_rent(String room_rent) {
		this.room_rent = room_rent;
	}

	public String getWater_charge() {
		return water_charge;
	}

	public void setWater_charge(String water_charge) {
		this.water_charge = water_charge;
	}

	public String getPower_charge() {
		return power_charge;
	}

	public void setPower_charge(String power_charge) {
		this.power_charge = power_charge;
	}

	public String getExtra_charge() {
		return extra_charge;
	}

	public void setExtra_charge(String extra_charge) {
		this.extra_charge = extra_charge;
	}

	public String getCable_charge() {
		return cable_charge;
	}

	public void setCable_charge(String cable_charge) {
		this.cable_charge = cable_charge;
	}

	public String getHeating_charge() {
		return heating_charge;
	}

	public void setHeating_charge(String heating_charge) {
		this.heating_charge = heating_charge;
	}

	public String getTotal_charge() {
		return total_charge;
	}

	public void setTotal_charge(String total_charge) {
		this.total_charge = total_charge;
	}

	public String getRoom_deposit() {
		return room_deposit;
	}

	public void setRoom_deposit(String room_deposit) {
		this.room_deposit = room_deposit;
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

	public void setValue(PaymentManageForm form) {
		this.live_id = form.getLive_id();
		this.pay_date = form.getPay_date();
		this.start_date = form.getStart_date();
		this.end_date = form.getEnd_date();
		this.room_rent = form.getRoom_rent();
		this.water_charge = form.getWater_charge();
		this.power_charge = form.getPower_charge();
		this.extra_charge = form.getExtra_charge();
		this.cable_charge = form.getCable_charge();
		this.heating_charge = form.getHeating_charge();
		this.total_charge = form.getTotal_charge();
		this.room_deposit = form.getRoom_deposit();
		this.comment = form.getComment();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
