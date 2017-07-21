package com.feifan.paymentmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;

public class PaymentManageCreateReferBackAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PaymentManageForm paymentManageForm = (PaymentManageForm) form;
		// 取得输入画面已输入的值
		PaymentManageForm input = (PaymentManageForm) request.getSession().getAttribute("paymentManageCreateInput");
		// 设定输入值
		paymentManageForm.setLive_id(input.getId());
		paymentManageForm.setPerson_num(input.getPerson_num());
		paymentManageForm.setName(input.getName());
		paymentManageForm.setBuilding_floor(input.getBuilding_floor());
		paymentManageForm.setHouse_num(input.getHouse_num());
		paymentManageForm.setHouse_type(input.getHouse_type());
		paymentManageForm.setPay_date(input.getPay_date());
		paymentManageForm.setStart_date(input.getStart_date());
		paymentManageForm.setEnd_date(input.getEnd_date());
		paymentManageForm.setRoom_rent(input.getRoom_rent());
		paymentManageForm.setComment(input.getComment());
		// 由Action或Form迁移回去时，日期不设定默认值
		request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");
		return mapping.findForward("success");
	}
}
