package com.feifan.daoserviceimpl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.UserManageDaoService;
import com.feifan.usermanage.sqlbean.UserManageCreateConfirmExecuteParamBean;
import com.feifan.usermanage.sqlbean.UserManageModifyConfirmExecuteParamBean;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectParamBean;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectResultBean;

public class UserManageDaoServiceImpl extends SqlMapClientDaoSupport implements UserManageDaoService {

	@SuppressWarnings("unchecked")
	// 检索输入画面的检索按钮
	public List<UserManageSelectInputSelectResultBean> userManageSelectInputSelect(UserManageSelectInputSelectParamBean paramBean) {
		List<UserManageSelectInputSelectResultBean> results = (List<UserManageSelectInputSelectResultBean>) this.getSqlMapClientTemplate().queryForList("userManageSelectInputSelect", paramBean);
		return results;
	}

	// 新增确认画面的执行按钮
	public void userManageCreateConfirmExecute(UserManageCreateConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().insert("userManageCreateConfirmExecute", paramBean);
	}

	// 修改确认画面的执行按钮
	public void userManageModifyConfirmExecute(UserManageModifyConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("userManageModifyConfirmExecute", paramBean);
	}

	// 删除确认画面的执行按钮
	public void userManageDeleteConfirmExecute(String id) {
		this.getSqlMapClientTemplate().update("userManageDeleteConfirmExecute", id);
	}

	// 新增确认画面的执行按钮--验证
	public int userManageCreateConfirmValidate(String username) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("userManageCreateConfirmValidate", username);
		return count;
	}

}
