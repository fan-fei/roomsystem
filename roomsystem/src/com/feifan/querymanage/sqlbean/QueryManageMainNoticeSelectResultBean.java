package com.feifan.querymanage.sqlbean;

public class QueryManageMainNoticeSelectResultBean {

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
	// 结束日期
	private String end_date;
	
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
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

}
