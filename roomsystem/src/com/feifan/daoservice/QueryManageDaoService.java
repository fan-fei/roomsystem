package com.feifan.daoservice;

import java.util.List;

import com.feifan.querymanage.sqlbean.QueryManageMainBedSelectResultBean;
import com.feifan.querymanage.sqlbean.QueryManageMainNoticeSelectResultBean;

public interface QueryManageDaoService {
	public abstract List<QueryManageMainNoticeSelectResultBean> queryManageMainNoticeSelect();

	public abstract List<QueryManageMainBedSelectResultBean> queryManageMainBedSelect();

}
