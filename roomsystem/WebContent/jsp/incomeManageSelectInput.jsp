<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--进帐统计管理--检索条件画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				进帐统计管理--检索条件画面
			</div>
			<hr>
			<div id="operatehint">
				请输入相应检索条件进行检索！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/incomeManageSelectInputSelect">
				<div id="selectinputdiv">
					<table>
						<tr>
							<th>
								楼号
							</th>
							<td>
								<span><html:select name="incomeManageForm" property="building_num" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="A楼">A楼</html:option>
										<html:option value="B楼">B楼</html:option>
										<html:option value="C楼">C楼</html:option>
										<html:option value="D楼">D楼</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								楼层
							</th>
							<td>
								<span><html:select name="incomeManageForm" property="floor_num" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="1层">1层</html:option>
										<html:option value="2层">2层</html:option>
										<html:option value="3层">3层</html:option>
										<html:option value="4层">4层</html:option>
										<html:option value="5层">5层</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								年度
							</th>
							<td>
								<span><html:select name="incomeManageForm" property="year" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="2010">2010年</html:option>
										<html:option value="2011">2011年</html:option>
										<html:option value="2012">2012年</html:option>
										<html:option value="2013">2013年</html:option>
										<html:option value="2014">2014年</html:option>
										<html:option value="2015">2015年</html:option>
										<html:option value="2016">2016年</html:option>
										<html:option value="2017">2017年</html:option>
										<html:option value="2018">2018年</html:option>
										<html:option value="2019">2019年</html:option>
										<html:option value="2020">2020年</html:option>
									</html:select></span>
							</td>
						</tr>
						<tr>
							<th>
								月度
							</th>
							<td>
								<span><html:select name="incomeManageForm" property="month" styleClass="select">
										<html:option value=""></html:option>
										<html:option value="01">01月</html:option>
										<html:option value="02">02月</html:option>
										<html:option value="03">03月</html:option>
										<html:option value="04">04月</html:option>
										<html:option value="05">05月</html:option>
										<html:option value="06">06月</html:option>
										<html:option value="07">07月</html:option>
										<html:option value="08">08月</html:option>
										<html:option value="09">09月</html:option>
										<html:option value="10">10月</html:option>
										<html:option value="11">11月</html:option>
										<html:option value="12">12月</html:option>
									</html:select></span>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:submit property="select" value="检索" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
