package com.feifan.querymanage.sqlbean;

public class QueryManageMainBedSelectResultBean {
	
	// 楼号楼层
	private String building_floor;
	// 房间号码
	private String house_num;
	// 房间类型
	private String house_type;
	// 房间朝向
	private String house_towards;
	// 可住人数
	private String allow_num;
	// 已住人数
	private String already_num;
	// 剩余床位
	private String spare_num;
	// 备注
	private String comment;

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

	public String getAlready_num() {
		return already_num;
	}

	public void setAlready_num(String already_num) {
		this.already_num = already_num;
	}

	public String getSpare_num() {
		return spare_num;
	}

	public void setSpare_num(String spare_num) {
		this.spare_num = spare_num;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
