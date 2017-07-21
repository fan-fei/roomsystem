package com.feifan.daoserviceimpl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.querymanage.sqlbean.QueryManageMainBedSelectResultBean;
import com.feifan.querymanage.sqlbean.QueryManageMainNoticeSelectResultBean;
import com.feifan.daoservice.QueryManageDaoService;

@SuppressWarnings("unchecked")
public class QueryManageDaoServiceImpl extends SqlMapClientDaoSupport implements QueryManageDaoService {

	// 需要提醒交租查询
	public List<QueryManageMainNoticeSelectResultBean> queryManageMainNoticeSelect() {
		List<QueryManageMainNoticeSelectResultBean> results = (List<QueryManageMainNoticeSelectResultBean>) this.getSqlMapClientTemplate().queryForList("queryManageMainNoticeSelect");
		return results;
	}

	// 房间床位状况查询
	public List<QueryManageMainBedSelectResultBean> queryManageMainBedSelect() {
		List<QueryManageMainBedSelectResultBean> results = (List<QueryManageMainBedSelectResultBean>) this.getSqlMapClientTemplate().queryForList("queryManageMainBedSelect");
		return results;
	}
}
