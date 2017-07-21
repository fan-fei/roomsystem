package com.feifan.daoservice;

import java.util.List;

import com.feifan.housemanage.sqlbean.HouseManageCreateConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageCreateConfirmValidateParamBean;
import com.feifan.housemanage.sqlbean.HouseManageDeleteConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageModifyConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectParamBean;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectResultBean;

public interface HouseManageDaoService {
	public abstract List<HouseManageSelectInputSelectResultBean> houseManageSelectInputSelect(HouseManageSelectInputSelectParamBean paramBean);

	public abstract void houseManageCreateConfirmExecute(HouseManageCreateConfirmExecuteParamBean paramBean);

	public abstract void houseManageModifyConfirmExecute(HouseManageModifyConfirmExecuteParamBean paramBean);

	public abstract int houseManageDeleteConfirmValidate(String id);

	public abstract void houseManageDeleteConfirmExecute(HouseManageDeleteConfirmExecuteParamBean paramBean);

	public abstract int houseManageCreateConfirmValidate(HouseManageCreateConfirmValidateParamBean paramBean);
}
