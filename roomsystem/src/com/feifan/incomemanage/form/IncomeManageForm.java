package com.feifan.incomemanage.form;

import org.apache.struts.action.ActionForm;

import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectResultBean;

public class IncomeManageForm extends ActionForm {
	private static final long serialVersionUID = -8263928191149030803L;
	// 楼号
	private String building_num;
	// 楼层
	private String floor_num;
	// 年度
	private String year;
	// 月度
	private String month;

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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setValue(IncomeManageSelectInputSelectResultBean resultBean) {
		this.building_num = resultBean.getBuilding_num();
		this.floor_num = resultBean.getFloor_num();
		this.year = resultBean.getYear();
		this.month = resultBean.getMonth();
	}
}
