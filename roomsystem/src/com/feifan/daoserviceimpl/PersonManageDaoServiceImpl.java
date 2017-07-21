package com.feifan.daoserviceimpl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.PersonManageDaoService;
import com.feifan.personmanage.sqlbean.PersonManageCreateConfirmExecuteParamBean;
import com.feifan.personmanage.sqlbean.PersonManageDeleteConfirmExecuteParamBean;
import com.feifan.personmanage.sqlbean.PersonManageModifyConfirmExecuteParamBean;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectParamBean;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectResultBean;

public class PersonManageDaoServiceImpl extends SqlMapClientDaoSupport implements PersonManageDaoService {

	@SuppressWarnings("unchecked")
	// 检索输入画面的检索按钮
	public List<PersonManageSelectInputSelectResultBean> personManageSelectInputSelect(PersonManageSelectInputSelectParamBean paramBean) {
		List<PersonManageSelectInputSelectResultBean> results = (List<PersonManageSelectInputSelectResultBean>) this.getSqlMapClientTemplate().queryForList("personManageSelectInputSelect", paramBean);
		return results;
	}

	// 新增确认画面的执行按钮
	public void personManageCreateConfirmExecute(PersonManageCreateConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().insert("personManageCreateConfirmExecute", paramBean);
	}

	// 修改确认画面的执行按钮
	public void personManageModifyConfirmExecute(PersonManageModifyConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("personManageModifyConfirmExecute", paramBean);
	}

	// 删除确认画面的执行按钮--验证
	public int personManageDeleteConfirmValidate(String id) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("personManageDeleteConfirmValidate", id);
		return count;
	}

	// 删除确认画面的执行按钮
	public void personManageDeleteConfirmExecute(PersonManageDeleteConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("personManageDeleteConfirmExecute", paramBean);
	}

	// 新增确认画面的执行按钮--验证
	public int personManageCreateConfirmValidate(String person_num) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("personManageCreateConfirmValidate", person_num);
		return count;
	}

}
