package com.feifan.livemanage.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectResultBean;

public class LiveManageForm extends ActionForm {

	private static final long serialVersionUID = 1237858150232353776L;
	// ID
	private String id;
	// 人员ID
	private String person_id;
	// 身份证号
	private String person_num;
	// 姓名
	private String name;
	// 房间ID
	private String house_id;
	// 楼号楼层
	private String building_floor;
	// 房间号码
	private String house_num;
	// 房间类型
	private String house_type;
	// 床位号码
	private String bed_num;
	// 迁入日期
	private String enter_date;
	// 备注
	private String comment;
	// 最后操作帐号
	private String lastupdated_operator;
	// 最后操作时间
	private String lastupdated_date;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if (null == person_num || person_num.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "身份证号"));
		} else if (!CommonUtility.isPerson_Num(person_num)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "身份证号"));
		} else if (null == name || name.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "姓名"));
		} else if (null == house_num || house_num.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间号码"));
		} else if (!CommonUtility.isHouse_Num(house_num)) {
			actionErrors.add("error", new ActionMessage("global_form_04", "房间号码"));
		} else if (null == house_type || house_type.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "房间类型"));
		} else if (null == enter_date || enter_date.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "迁入日期"));
		} else if (!CommonUtility.isDate(enter_date)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "迁入日期"));
		} else if (!CommonUtility.isBed_Num(bed_num)) {
			actionErrors.add("error", new ActionMessage("global_form_02", "床位号码"));
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

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
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

	public String getHouse_id() {
		return house_id;
	}

	public void setHouse_id(String house_id) {
		this.house_id = house_id;
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

	public String getBed_num() {
		return bed_num;
	}

	public void setBed_num(String bed_num) {
		this.bed_num = bed_num;
	}

	public String getEnter_date() {
		return enter_date;
	}

	public void setEnter_date(String enter_date) {
		this.enter_date = enter_date;
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

	public void setValue(LiveManageSelectInputSelectResultBean resultBean) {
		this.id = resultBean.getId();
		this.person_num = resultBean.getPerson_num();
		this.name = resultBean.getName();
		this.building_floor = resultBean.getBuilding_floor();
		this.house_num = resultBean.getHouse_num();
		this.house_type = resultBean.getHouse_type();
		this.bed_num = resultBean.getBed_num();
		this.enter_date = resultBean.getEnter_date();
		this.comment = resultBean.getComment();
	}
}
