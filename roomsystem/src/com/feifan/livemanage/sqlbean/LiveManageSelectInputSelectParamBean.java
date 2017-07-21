package com.feifan.livemanage.sqlbean;

import com.feifan.livemanage.form.LiveManageForm;

public class LiveManageSelectInputSelectParamBean {
	// 姓名
	private String name;
	// 房间号码
	private String house_num;

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

	public void setValue(LiveManageForm form) {
		this.name = "%" + form.getName() + "%";
		this.house_num = "%" + form.getHouse_num() + "%";
	}
}
