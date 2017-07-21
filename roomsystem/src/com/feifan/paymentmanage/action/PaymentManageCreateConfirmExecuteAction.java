package com.feifan.paymentmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;
import com.feifan.paymentmanage.sqlbean.PaymentManageCreateConfirmExecuteParamBean;

public class PaymentManageCreateConfirmExecuteAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		PaymentManageForm paymentManageForm = (PaymentManageForm) form;
		// 验证该住宿状况是否存在
		int count = paymentmanagedaoserviceimpl.paymentManageCreateConfirmValidate(paymentManageForm.getLive_id());
		// 如果该成员已经已经被其他管理员迁出，则当前管理员不能再执行交租操作
		if (count == 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("paymentmanage_action_01"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 执行
		PaymentManageCreateConfirmExecuteParamBean paramBean = new PaymentManageCreateConfirmExecuteParamBean();
		paramBean.setValue(paymentManageForm);

		paymentmanagedaoserviceimpl.paymentManageCreateConfirmExecute(paramBean);

		return mapping.findForward("success");
	}
}
