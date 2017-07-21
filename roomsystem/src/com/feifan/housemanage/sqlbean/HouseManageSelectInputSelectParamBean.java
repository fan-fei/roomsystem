package com.feifan.housemanage.sqlbean;

import com.feifan.housemanage.form.HouseManageForm;

public class HouseManageSelectInputSelectParamBean {
	// 房间号码
	private String house_num;
	// 楼号
	private String building_num;
	// 楼层
	private String floor_num;

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

	public void setValue(HouseManageForm form) {
		this.house_num = "%" + form.getHouse_num() + "%";
		this.building_num = form.getBuilding_num();
		this.floor_num = form.getFloor_num();
	}
}
