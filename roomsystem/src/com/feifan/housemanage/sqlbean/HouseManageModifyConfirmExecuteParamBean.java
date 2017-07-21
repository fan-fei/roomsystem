package com.feifan.housemanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.housemanage.form.HouseManageForm;

public class HouseManageModifyConfirmExecuteParamBean {
	// ID
	private String id;
	// 房间号码
	private String house_num;
	// 楼号
	private String building_num;
	// 楼层
	private String floor_num;
	// 房间类型
	private String house_type;
	// 房间朝向
	private String house_towards;
	// 可住人数
	private String allow_num;
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

	public String getHouse_num() {
		return house_num;
	}

	public void setHouse_num(String house_num) {
		this.house_num = house_num;
	}

	public String getBuilding_num() {
		return building_num;
	}

	public void setBuilding_num(String building_num) {
		this.building_num = building_num;
	}

	public String getFloor_num() {
		return floor_num;
	}

	public void setFloor_num(String floor_num) {
		this.floor_num = floor_num;
	}

	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public String getHouse_towards() {
		return house_towards;
	}

	public void setHouse_towards(String house_towards) {
		this.house_towards = house_towards;
	}

	public String getAllow_num() {
		return allow_num;
	}

	public void setAllow_num(String allow_num) {
		this.allow_num = allow_num;
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

	public void setValue(HouseManageForm form) {
		this.id = form.getId();
		this.house_num = form.getHouse_num();
		this.building_num = form.getBuilding_num();
		this.floor_num = form.getFloor_num();
		this.house_type = form.getHouse_type();
		this.house_towards = form.getHouse_towards();
		this.allow_num = form.getAllow_num();
		this.comment = form.getComment();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
