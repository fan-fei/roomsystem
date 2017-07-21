package com.feifan.housemanage.sqlbean;

public class HouseManageSelectInputSelectResultBean {
	// ID
	private String id;
	// 房间号码
	private String house_num;
	// 房间类型
	private String house_type;
	// 楼号
	private String building_num;
	// 楼层
	private String floor_num;
	// 房间朝向
	private String house_towards;
	// 可住人数
	private String allow_num;
	// 备注
	private String comment;
	
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
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
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
}
