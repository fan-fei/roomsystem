<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.feifan.common.CommonUtility"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<div id="headdiv">
	<div id="firstdiv">
		<a href="http://www.fanfei.tech" target="_blank"><img alt="www.fanfei.tech 非凡科技集团有限公司" src="images/9.jpg"> </a> <b><span><bean:write name="nickname" /> </span> <font color="blue"><%=CommonUtility.getSysDate(1) %></font></b>
		<html:button property="modifypassword" styleClass="button" onclick="pageLoad('loginManageSetUserInput.jsp')">帐号设置</html:button>
		<html:button property="logout" styleClass="button" onclick="pageLoad('../loginManageLogout.do')">退出</html:button>
		<br>
		<br>
		<br>
		<span id="title"> <b>公寓管理系统</b> </span>
	</div>
	<%
		String activated = "";
		if (request.getRequestURI().contains("main")) {
			activated = "0";
		} else if (request.getRequestURI().contains("person")) {
			activated = "1";
		} else if (request.getRequestURI().contains("house")) {
			activated = "2";
		} else if (request.getRequestURI().contains("live")) {
			activated = "3";
		} else if (request.getRequestURI().contains("payment")) {
			activated = "4";
		} else if (request.getRequestURI().contains("query")) {
			activated = "5";
		} else if (request.getRequestURI().contains("income")) {
			activated = "6";
		} else if (request.getRequestURI().contains("user")) {
			activated = "7";
		}
		request.setAttribute("activated", activated);
	%>
	<div id="seconddiv">
		<p align="center">
			<logic:equal name="activated"  value="0"><span class="activated"><a href="main.jsp">首页</a> </span></logic:equal>
			<logic:notEqual name="activated" value="0"><span><a href="main.jsp">首页</a> </span></logic:notEqual>
			<logic:equal name="activated"  value="1"><span class="activated"><a href="personManageSelectInput.jsp">人员管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="1"><span><a href="personManageSelectInput.jsp">人员管理</a> </span></logic:notEqual>
			<logic:equal name="activated"  value="2"><span class="activated"><a href="houseManageSelectInput.jsp">房间管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="2"><span><a href="houseManageSelectInput.jsp">房间管理</a> </span></logic:notEqual>
			<logic:equal name="activated"  value="3"><span class="activated"><a href="liveManageSelectInput.jsp">住宿管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="3"><span><a href="liveManageSelectInput.jsp">住宿管理</a> </span></logic:notEqual>
			<logic:equal name="activated"  value="4"><span class="activated"><a href="paymentManageSelectInput.jsp">租金管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="4"><span><a href="paymentManageSelectInput.jsp">租金管理</a> </span></logic:notEqual>
			<logic:equal name="activated"  value="5"><span class="activated"><a href="queryManageMain.jsp">综合查询管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="5"><span><a href="queryManageMain.jsp">综合查询管理</a> </span></logic:notEqual>
			<logic:equal name="activated"  value="6"><span class="activated"><a href="incomeManageSelectInput.jsp">进帐统计管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="6"><span><a href="incomeManageSelectInput.jsp">进帐统计管理</a> </span></logic:notEqual>		
			<logic:equal name="authority"  value="manager">
			<logic:equal name="activated"  value="7"><span class="activated"><a href="userManageSelectInput.jsp">帐号管理</a> </span></logic:equal>
			<logic:notEqual name="activated" value="7"><span><a href="userManageSelectInput.jsp">帐号管理</a> </span></logic:notEqual>	
			</logic:equal>
		</p>
	</div>
</div>