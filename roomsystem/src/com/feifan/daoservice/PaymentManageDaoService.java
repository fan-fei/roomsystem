package com.feifan.daoservice;

import java.util.List;

import com.feifan.paymentmanage.sqlbean.PaymentManageCreateConfirmExecuteParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageCreateInputReferResultBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageDeleteConfirmExecuteParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageModifyConfirmExecuteParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectResultBean;

public interface PaymentManageDaoService {
	public abstract List<PaymentManageSelectInputSelectResultBean> paymentManageSelectInputSelect(PaymentManageSelectInputSelectParamBean paramBean);

	public abstract List<PaymentManageCreateInputReferResultBean> paymentManageCreateInputRefer();

	public abstract int paymentManageCreateConfirmValidate(String live_id);

	public abstract void paymentManageCreateConfirmExecute(PaymentManageCreateConfirmExecuteParamBean paramBean);

	public abstract void paymentManageModifyConfirmExecute(PaymentManageModifyConfirmExecuteParamBean paramBean);

	public abstract void paymentManageDeleteConfirmExecute(PaymentManageDeleteConfirmExecuteParamBean paramBean);

}
