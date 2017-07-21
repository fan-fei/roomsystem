package com.feifan.daoservice;

import java.util.List;

import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectParamBean;
import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectResultBean;

public interface IncomeManageDaoService {
	public abstract List<IncomeManageSelectInputSelectResultBean> incomeManageSelectInputSelect(IncomeManageSelectInputSelectParamBean paramBean);

}
