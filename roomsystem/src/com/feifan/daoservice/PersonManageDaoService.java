package com.feifan.daoservice;

import java.util.List;

import com.feifan.personmanage.sqlbean.PersonManageCreateConfirmExecuteParamBean;
import com.feifan.personmanage.sqlbean.PersonManageDeleteConfirmExecuteParamBean;
import com.feifan.personmanage.sqlbean.PersonManageModifyConfirmExecuteParamBean;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectParamBean;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectResultBean;

public interface PersonManageDaoService {
	public abstract List<PersonManageSelectInputSelectResultBean> personManageSelectInputSelect(PersonManageSelectInputSelectParamBean paramBean);

	public abstract void personManageCreateConfirmExecute(PersonManageCreateConfirmExecuteParamBean paramBean);

	public abstract void personManageModifyConfirmExecute(PersonManageModifyConfirmExecuteParamBean paramBean);

	public abstract int personManageDeleteConfirmValidate(String id);

	public abstract void personManageDeleteConfirmExecute(PersonManageDeleteConfirmExecuteParamBean paramBean);

	public abstract int personManageCreateConfirmValidate(String person_num);
}
