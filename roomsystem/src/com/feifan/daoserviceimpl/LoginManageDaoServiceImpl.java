package com.feifan.daoserviceimpl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.LoginManageDaoService;
import com.feifan.loginmanage.sqlbean.LoginManageLoginValidateParamBean;
import com.feifan.loginmanage.sqlbean.LoginManageLoginValidateResultBean;
import com.feifan.loginmanage.sqlbean.LoginManageSetUserConfirmExecuteParamBean;
import com.feifan.loginmanage.sqlbean.LoginManageSetUserConfirmValidateParamBean;

public class LoginManageDaoServiceImpl extends SqlMapClientDaoSupport implements LoginManageDaoService {
	// 登录画面登录
	public LoginManageLoginValidateResultBean loginManageLoginValidate(LoginManageLoginValidateParamBean paramBean) {
		LoginManageLoginValidateResultBean result = (LoginManageLoginValidateResultBean) this.getSqlMapClientTemplate().queryForObject("loginManageLoginValidate", paramBean);
		return result;
	}

	// 帐号设置验证
	public int loginManageSetUserConfirmValidate(LoginManageSetUserConfirmValidateParamBean paramBean) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("loginManageSetUserConfirmValidate", paramBean);
		return count;
	}

	// 帐号设置执行
	public void loginManageSetUserConfirmExecute(LoginManageSetUserConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("loginManageSetUserConfirmExecute", paramBean);
	}

	// 帐号设置验证--不设置密码
	public int loginManageSetUserConfirmValidateNoPassword(LoginManageSetUserConfirmValidateParamBean paramBean) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("loginManageSetUserConfirmValidateNoPassword", paramBean);
		return count;
	}

	// 帐号设置执行--不设置密码
	public void loginManageSetUserConfirmExecuteNoPassword(LoginManageSetUserConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("loginManageSetUserConfirmExecuteNoPassword", paramBean);
	}

}
