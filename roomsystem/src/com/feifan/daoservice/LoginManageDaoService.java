package com.feifan.daoservice;

import com.feifan.loginmanage.sqlbean.LoginManageLoginValidateParamBean;
import com.feifan.loginmanage.sqlbean.LoginManageLoginValidateResultBean;
import com.feifan.loginmanage.sqlbean.LoginManageSetUserConfirmExecuteParamBean;
import com.feifan.loginmanage.sqlbean.LoginManageSetUserConfirmValidateParamBean;

public interface LoginManageDaoService {

	public abstract LoginManageLoginValidateResultBean loginManageLoginValidate(LoginManageLoginValidateParamBean paramBean);

	public abstract int loginManageSetUserConfirmValidate(LoginManageSetUserConfirmValidateParamBean paramBean);

	public abstract void loginManageSetUserConfirmExecute(LoginManageSetUserConfirmExecuteParamBean paramBean);

	public abstract int loginManageSetUserConfirmValidateNoPassword(LoginManageSetUserConfirmValidateParamBean paramBean);

	public abstract void loginManageSetUserConfirmExecuteNoPassword(LoginManageSetUserConfirmExecuteParamBean paramBean);

}
