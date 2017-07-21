package com.feifan.daoservice;

import java.util.List;

import com.feifan.livemanage.sqlbean.LiveManageCreateConfirmExecuteParamBean;
import com.feifan.livemanage.sqlbean.LiveManageCreateInputReferResultBean;
import com.feifan.livemanage.sqlbean.LiveManageDeleteConfirmExecuteParamBean;
import com.feifan.livemanage.sqlbean.LiveManageModifyConfirmExecuteParamBean;
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectParamBean;
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectResultBean;

public interface LiveManageDaoService {
	public abstract List<LiveManageSelectInputSelectResultBean> liveManageSelectInputSelect(LiveManageSelectInputSelectParamBean paramBean);

	public abstract void liveManageCreateConfirmExecute(LiveManageCreateConfirmExecuteParamBean paramBean);

	public abstract void liveManageModifyConfirmExecute(LiveManageModifyConfirmExecuteParamBean paramBean);

	public abstract void liveManageDeleteConfirmExecute(LiveManageDeleteConfirmExecuteParamBean paramBean);

	public abstract int liveManageCreateConfirmValidatePerson(String person_id);

	public abstract int liveManageCreateConfirmValidateHouse(String house_id);

	public abstract List<LiveManageCreateInputReferResultBean> liveManageCreateInputRefer(String refer);
}
