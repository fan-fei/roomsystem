package com.feifan.daoserviceimpl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.IncomeManageDaoService;
import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectParamBean;
import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectResultBean;

public class IncomeManageDaoServiceImpl extends SqlMapClientDaoSupport implements IncomeManageDaoService {

	@SuppressWarnings("unchecked")
	// 检索输入画面的检索按钮
	public List<IncomeManageSelectInputSelectResultBean> incomeManageSelectInputSelect(IncomeManageSelectInputSelectParamBean paramBean) {
		List<IncomeManageSelectInputSelectResultBean> results = (List<IncomeManageSelectInputSelectResultBean>) this.getSqlMapClientTemplate().queryForList("incomeManageSelectInputSelect", paramBean);
		return results;
	}

}
