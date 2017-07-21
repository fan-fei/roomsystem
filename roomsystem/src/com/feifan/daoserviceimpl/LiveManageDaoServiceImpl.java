package com.feifan.daoserviceimpl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.LiveManageDaoService;
import com.feifan.livemanage.sqlbean.LiveManageCreateConfirmExecuteParamBean;
import com.feifan.livemanage.sqlbean.LiveManageCreateInputReferResultBean;
import com.feifan.livemanage.sqlbean.LiveManageDeleteConfirmExecuteParamBean;
import com.feifan.livemanage.sqlbean.LiveManageModifyConfirmExecuteParamBean;
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectParamBean;
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectResultBean;

@SuppressWarnings("unchecked")
public class LiveManageDaoServiceImpl extends SqlMapClientDaoSupport implements LiveManageDaoService {

	// 检索输入画面的检索按钮
	public List<LiveManageSelectInputSelectResultBean> liveManageSelectInputSelect(LiveManageSelectInputSelectParamBean paramBean) {
		List<LiveManageSelectInputSelectResultBean> results = (List<LiveManageSelectInputSelectResultBean>) this.getSqlMapClientTemplate().queryForList("liveManageSelectInputSelect", paramBean);
		return results;
	}

	// 新增确认画面的执行按钮
	public void liveManageCreateConfirmExecute(LiveManageCreateConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().insert("liveManageCreateConfirmExecute", paramBean);
	}

	// 修改确认画面的执行按钮
	public void liveManageModifyConfirmExecute(LiveManageModifyConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("liveManageModifyConfirmExecute", paramBean);
	}

	// 删除确认画面的执行按钮
	public void liveManageDeleteConfirmExecute(LiveManageDeleteConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("liveManageDeleteConfirmExecute", paramBean);
	}

	// 新增输入画面的参照按钮
	public List<LiveManageCreateInputReferResultBean> liveManageCreateInputRefer(String refer) {
		List<LiveManageCreateInputReferResultBean> results = null;
		if (refer.equals("person")) {
			results = (List<LiveManageCreateInputReferResultBean>) this.getSqlMapClientTemplate().queryForList("liveManageCreateInputReferPerson");
		} else if (refer.equals("house")) {
			results = (List<LiveManageCreateInputReferResultBean>) this.getSqlMapClientTemplate().queryForList("liveManageCreateInputReferHouse");
		}
		return results;
	}

	// 新增确认画面的执行按钮--验证
	public int liveManageCreateConfirmValidatePerson(String person_id) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("liveManageCreateConfirmValidatePerson", person_id);
		return count;
	}

	// 新增确认画面的执行按钮--验证
	public int liveManageCreateConfirmValidateHouse(String house_id) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("liveManageCreateConfirmValidateHouse", house_id);
		return count;
	}

}
