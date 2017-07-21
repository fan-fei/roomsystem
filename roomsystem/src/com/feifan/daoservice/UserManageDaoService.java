package com.feifan.daoservice;

import java.util.List;

import com.feifan.usermanage.sqlbean.UserManageCreateConfirmExecuteParamBean;
import com.feifan.usermanage.sqlbean.UserManageModifyConfirmExecuteParamBean;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectParamBean;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectResultBean;

public interface UserManageDaoService {
	public abstract List<UserManageSelectInputSelectResultBean> userManageSelectInputSelect(UserManageSelectInputSelectParamBean paramBean);

	public abstract void userManageCreateConfirmExecute(UserManageCreateConfirmExecuteParamBean paramBean);

	public abstract void userManageModifyConfirmExecute(UserManageModifyConfirmExecuteParamBean paramBean);

	public abstract void userManageDeleteConfirmExecute(String id);

	public abstract int userManageCreateConfirmValidate(String username);
}
