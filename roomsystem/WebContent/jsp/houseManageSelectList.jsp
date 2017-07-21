<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--房间管理--检索一览画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				房间管理--检索一览画面
			</div>
			<hr>
			<div id="operatehint">
				请选择相应行进行修改或删除！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/houseManageSelectListBack">
				<div id="selectlistheaderdiv">
					<table>
						<tr>
							<th width="5%" >
								No
							</th>
							<th width="10%">
								操作
							</th>
							<th width="10%">
								楼号
							</th>
							<th width="10%">
								楼层
							</th>
							<th width="10%">
								房间号码
							</th>
							<th width="10%">
								房间类型
							</th>
							<th width="10%">
								房间朝向
							</th>
							<th width="10%">
								可住人数
							</th>
							<th width="25%">
								备注
							</th>
						</tr>
					</table>
				</div>
				<div id="selectlistcontextdiv">
					<table>
						<logic:iterate id="element" name="houseManageSelectInputSelectResult" indexId="index">
							<tr>
								<td width="5%">
									<span><%= index.intValue() + 1 %></span>
								</td>
								<td width="10%">
									<input type="button" class="buttoninlist" value="修改" onclick="formSubmit('../houseManageSelectListModify.do','<bean:write name="index"  />')">
									<input type="button" class="buttoninlist" value="删除" onclick="formSubmit('../houseManageSelectListDelete.do','<bean:write name="index"  />')">
								</td>
								<td width="10%">
									<span><bean:write name="element" property="building_num" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="floor_num" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="house_num" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="house_type" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="house_towards" /></span>
								</td>
								<td width="10%">
									<span><bean:write name="element" property="allow_num" /></span>
								</td>
								<td width="25%">
									<span><bean:write name="element" property="comment" /></span>
								</td>
							</tr>
						</logic:iterate>
					</table>
				</div>
				<br />
				<html:submit property="back" value="返回" styleClass="button"></html:submit>
			</html:form>
		</div>
		<%@include file="footer.inc"%>
	</div>
</body>
</html:html>
