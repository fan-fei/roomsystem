package com.feifan.paymentmanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;
import com.feifan.paymentmanage.sqlbean.PaymentManageCreateInputReferResultBean;

public class PaymentManageCreateReferChooseAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PaymentManageForm paymentManageForm = (PaymentManageForm) form;
		String index = (String) request.getParameter("index");
		// 从参照一览画面取得部分字段，设定到输入画面
		PaymentManageCreateInputReferResultBean resultBean = ((List<PaymentManageCreateInputReferResultBean>) request.getSession().getAttribute("paymentManageCreateInputReferResult")).get(Integer.parseInt(index));
		paymentManageForm.setLive_id(resultBean.getId());
		paymentManageForm.setPerson_num(resultBean.getPerson_num());
		paymentManageForm.setName(resultBean.getName());
		paymentManageForm.setBuilding_floor(resultBean.getBuilding_floor());
		paymentManageForm.setHouse_num(resultBean.getHouse_num());
		paymentManageForm.setHouse_type(resultBean.getHouse_type());
		// 重新设定输入画面已经有输入的字段
		PaymentManageForm input = (PaymentManageForm) request.getSession().getAttribute("paymentManageCreateInput");
		paymentManageForm.setPay_date(input.getPay_date());
		paymentManageForm.setRoom_rent(input.getRoom_rent());
		paymentManageForm.setWater_charge(input.getWater_charge());
		paymentManageForm.setPower_charge(input.getPower_charge());
		paymentManageForm.setExtra_charge(input.getExtra_charge());
		paymentManageForm.setCable_charge(input.getCable_charge());
		paymentManageForm.setHeating_charge(input.getHeating_charge());
		paymentManageForm.setTotal_charge(input.getTotal_charge());
		paymentManageForm.setRoom_deposit(input.getRoom_deposit());
		paymentManageForm.setStart_date(input.getStart_date());
		paymentManageForm.setEnd_date(input.getEnd_date());
		paymentManageForm.setComment(input.getComment());
		// 由Action或Form迁移回去时，日期不设定默认值
		request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");

		return mapping.findForward("success");
	}
}
