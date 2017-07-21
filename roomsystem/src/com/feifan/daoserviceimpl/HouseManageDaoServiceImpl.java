package com.feifan.daoserviceimpl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.HouseManageDaoService;
import com.feifan.housemanage.sqlbean.HouseManageCreateConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageCreateConfirmValidateParamBean;
import com.feifan.housemanage.sqlbean.HouseManageDeleteConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageModifyConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectParamBean;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectResultBean;

public class HouseManageDaoServiceImpl extends SqlMapClientDaoSupport implements HouseManageDaoService {

	@SuppressWarnings("unchecked")
	// 检索输入画面的检索按钮
	public List<HouseManageSelectInputSelectResultBean> houseManageSelectInputSelect(HouseManageSelectInputSelectParamBean paramBean) {
		List<HouseManageSelectInputSelectResultBean> results = (List<HouseManageSelectInputSelectResultBean>) this.getSqlMapClientTemplate().queryForList("houseManageSelectInputSelect", paramBean);
		return results;
	}

	// 新增确认画面的执行按钮
	public void houseManageCreateConfirmExecute(HouseManageCreateConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().insert("houseManageCreateConfirmExecute", paramBean);
	}

	// 修改确认画面的执行按钮
	public void houseManageModifyConfirmExecute(HouseManageModifyConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("houseManageModifyConfirmExecute", paramBean);
	}

	// 删除确认画面的执行按钮--验证
	public int houseManageDeleteConfirmValidate(String id) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("houseManageDeleteConfirmValidate", id);
		return count;
	}

	// 删除确认画面的执行按钮
	public void houseManageDeleteConfirmExecute(HouseManageDeleteConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("houseManageDeleteConfirmExecute", paramBean);
	}

	// 新增确认画面的执行按钮--验证
	public int houseManageCreateConfirmValidate(HouseManageCreateConfirmValidateParamBean paramBean) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("houseManageCreateConfirmValidate", paramBean);
		return count;
	}

}
