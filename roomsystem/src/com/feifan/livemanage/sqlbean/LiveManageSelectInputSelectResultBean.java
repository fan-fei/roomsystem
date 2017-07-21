package com.feifan.livemanage.sqlbean;

public class LiveManageSelectInputSelectResultBean {
	// ID
	private String id;
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
	// 迁入日期
	private String enter_date;
	// 床位号码
	private String bed_num;
	// 备注
	private String comment;
	// 最后操作帐号
	private String lastupdated_operator;
	// 最后操作时间
	private String lastupdated_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEnter_date() {
		return enter_date;
	}
	public void setEnter_date(String enter_date) {
		this.enter_date = enter_date;
	}
	public String getBed_num() {
		return bed_num;
	}
	public void setBed_num(String bed_num) {
		this.bed_num = bed_num;
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

}
