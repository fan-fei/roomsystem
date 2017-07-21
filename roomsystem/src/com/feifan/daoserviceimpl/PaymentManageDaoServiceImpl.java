package com.feifan.daoserviceimpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.sqlbean.PaymentManageCreateConfirmExecuteParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageCreateInputReferResultBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageDeleteConfirmExecuteParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageModifyConfirmExecuteParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectResultBean;

@SuppressWarnings("unchecked")
public class PaymentManageDaoServiceImpl extends SqlMapClientDaoSupport implements PaymentManageDaoService {

	// 检索输入画面的检索按钮
	public List<PaymentManageSelectInputSelectResultBean> paymentManageSelectInputSelect(PaymentManageSelectInputSelectParamBean paramBean) {
		List<PaymentManageSelectInputSelectResultBean> results = (List<PaymentManageSelectInputSelectResultBean>) this.getSqlMapClientTemplate().queryForList("paymentManageSelectInputSelect", paramBean);
		return results;
	}

	// 新增确认画面的执行按钮
	public void paymentManageCreateConfirmExecute(PaymentManageCreateConfirmExecuteParamBean paramBean) {
		try {
			this.getSqlMapClient().startBatch();
			this.getSqlMapClientTemplate().insert("paymentManageCreateConfirmExecute", paramBean);
			this.getSqlMapClient().executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 修改确认画面的执行按钮
	public void paymentManageModifyConfirmExecute(PaymentManageModifyConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("paymentManageModifyConfirmExecute", paramBean);
	}

	// 删除确认画面的执行按钮
	public void paymentManageDeleteConfirmExecute(PaymentManageDeleteConfirmExecuteParamBean paramBean) {
		this.getSqlMapClientTemplate().update("paymentManageDeleteConfirmExecute", paramBean);
	}

	// 新增输入画面的参照按钮
	public List<PaymentManageCreateInputReferResultBean> paymentManageCreateInputRefer() {
		List<PaymentManageCreateInputReferResultBean> results = (List<PaymentManageCreateInputReferResultBean>) this.getSqlMapClientTemplate().queryForList("paymentManageCreateInputRefer");
		return results;
	}

	// 新增确认画面的执行按钮--验证
	public int paymentManageCreateConfirmValidate(String live_id) {
		int count = (Integer) this.getSqlMapClientTemplate().queryForObject("paymentManageCreateConfirmValidate", live_id);
		return count;
	}

}
