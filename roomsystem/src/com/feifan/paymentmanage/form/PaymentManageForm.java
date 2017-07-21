package com.feifan.paymentmanage.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectResultBean;

public class PaymentManageForm extends ActionForm {
	private static final long serialVersionUID = 7825683267473509202L;
	// ID
	private String id;
	// 住宿ID
	private String live_id;
	// 开始日期
	private String start_date;
	// 结束日期
	private String end_date;
	// 交租日期
	private String pay_date;
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
	// 最后操作帐号
	private String lastupdated_operator;
	// 最后操作时间
	private String lastupdated_date;
	// 身份证号
	private String person_num;
	// 姓名
	private String name;
	// 楼号楼层
	private String building_floor;
	// 房间号码
	private String house_num;
	// 房间类型
	private String house_type;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if (null == person_num || person_num.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "身份证号"));
		} else if (!CommonUtility.isPerson_Num(person_num)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "身份证号"));

		} else if (null == name || name.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "姓名"));

		} else if (null == building_floor || building_floor.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "楼号楼层"));

		} else if (null == house_num || house_num.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间号码"));
		} else if (!CommonUtility.isHouse_Num(house_num)) {
			actionErrors.add("error", new ActionMessage("global_form_04", "房间号码"));

		} else if (null == pay_date || pay_date.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "交租日期"));
		} else if (!CommonUtility.isDate(pay_date)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "交租日期"));

		} else if (null == room_rent || room_rent.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "租金"));
		} else if (!CommonUtility.isAmount(room_rent)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "租金"));

		} else if (null == water_charge || water_charge.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "水费"));
		} else if (!CommonUtility.isAmount(water_charge)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "水费"));

		} else if (null == power_charge || power_charge.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "电费"));
		} else if (!CommonUtility.isAmount(power_charge)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "电费"));

		} else if (null == extra_charge || extra_charge.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "杂费"));
		} else if (!CommonUtility.isAmount(extra_charge)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "杂费"));

		} else if (null == cable_charge || cable_charge.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "网费"));
		} else if (!CommonUtility.isAmount(cable_charge)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "网费"));

		} else if (null == heating_charge || heating_charge.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "暖费"));
		} else if (!CommonUtility.isAmount(heating_charge)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "暖费"));

		} else if (null == total_charge || total_charge.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "合计"));
		} else if (!CommonUtility.isAmount(total_charge)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "合计"));

		} else if (null == room_deposit || room_deposit.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间押金"));
		} else if (!CommonUtility.isAmount(room_deposit)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "房间押金"));

		} else if (null == start_date || start_date.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "开始日期"));
		} else if (!CommonUtility.isDate(start_date)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "开始日期"));

		} else if (null == end_date || end_date.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "结束日期"));
		} else if (!CommonUtility.isDate(end_date)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "结束日期"));

		} else if (!CommonUtility.isGreaterEqual(start_date, end_date)) {
			actionErrors.add("error", new ActionMessage("paymentmanage_form_01"));
		}
		// 由Action或Form迁移回去时，日期不设定默认值
		if (actionErrors.size() != 0) {
			request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");
		}
		return actionErrors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLive_id() {
		return live_id;
	}

	public void setLive_id(String live_id) {
		this.live_id = live_id;
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

	public String getLastupdated_date() {
		return lastupdated_date;
	}

	public void setLastupdated_date(String lastupdated_date) {
		this.lastupdated_date = lastupdated_date;
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

	public String getBuilding_floor() {
		return building_floor;
	}

	public void setBuilding_floor(String building_floor) {
		this.building_floor = building_floor;
	}

	public String getHouse_num() {
		return house_num;
	}

	public void setHouse_num(String house_num) {
		this.house_num = house_num;
	}

	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public void setValue(PaymentManageSelectInputSelectResultBean resultBean) {
		this.id = resultBean.getId();
		this.person_num = resultBean.getPerson_num();
		this.name = resultBean.getName();
		this.building_floor = resultBean.getBuilding_floor();
		this.house_num = resultBean.getHouse_num();

		this.live_id = resultBean.getLive_id();
		this.pay_date = resultBean.getPay_date();
		this.room_rent = resultBean.getRoom_rent();
		this.water_charge = resultBean.getWater_charge();
		this.power_charge = resultBean.getPower_charge();
		this.cable_charge = resultBean.getCable_charge();
		this.extra_charge = resultBean.getExtra_charge();
		this.heating_charge = resultBean.getHeating_charge();
		this.total_charge = resultBean.getTotal_charge();
		this.room_deposit = resultBean.getRoom_deposit();
		this.start_date = resultBean.getStart_date();
		this.end_date = resultBean.getEnd_date();
		this.comment = resultBean.getComment();
	}
}
