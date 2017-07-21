package com.feifan.housemanage.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectResultBean;

public class HouseManageForm extends ActionForm {
	private static final long serialVersionUID = -8263928191149030803L;
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

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();

		// 楼号
		if (null == building_num || "".equals(building_num.trim())) {
			actionErrors.add("error", new ActionMessage("global_form_01", "楼号"));
		// 楼层
		} else if (null == floor_num || "".equals(floor_num.trim())) {
			actionErrors.add("error", new ActionMessage("global_form_01", "楼层"));
		// 房间号码
		} else if (null == house_num || "".equals(house_num.trim())) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间号码"));
		} else if (!CommonUtility.isHouse_Num(house_num)) {
			actionErrors.add("error", new ActionMessage("global_form_04", "房间号码"));
		// 房间类型
		} else if (null == house_type || "".equals(house_type.trim())) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间类型"));
		// 房间朝向
		} else if (null == house_towards || "".equals(house_towards.trim())) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间朝向"));
		// 可住人数
		} else if (null == allow_num || "".equals(allow_num.trim())) {
			actionErrors.add("error", new ActionMessage("global_form_01", "可住人数"));
		} else if (!CommonUtility.isAllow_Num(allow_num)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "可住人数"));
		}
		return actionErrors;
	}

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

	public void setValue(HouseManageSelectInputSelectResultBean resultBean) {
		this.id = resultBean.getId();
		this.house_num = resultBean.getHouse_num();
		this.building_num = resultBean.getBuilding_num();
		this.floor_num = resultBean.getFloor_num();
		this.house_type = resultBean.getHouse_type();
		this.house_towards = resultBean.getHouse_towards();
		this.allow_num = resultBean.getAllow_num();
		this.comment = resultBean.getComment();
	}
}
