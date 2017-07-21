<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
	<html:base />
	<title>公寓管理系统--住宿管理--新增参照画面</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
	<div id="globaldiv">
		<%@include file="header.inc"%>
		<div id="messagediv">
			<br>
			<div id="pagehint">
				住宿管理--新增参照画面
			</div>
			<hr>
			<div id="operatehint">
				请选择相应行进行修改或删除！
			</div>
			<br>
		</div>
		<div id="bodydiv">
			<html:form action="/liveManageCreateReferBack">
				<div id="selectlistheaderdiv">
					<logic:equal name="refer" value="person">
						<table>
							<tr>
								<th width="5%">
									No
								</th>
								<th width="10%">
									操作
								</th>
								<th width="18%">
									身份证号
								</th>
								<th width="9%">
									姓名
								</th>
								<th width="5%">
									性别
								</th>
								<th width="17%">
									藉贯
								</th>
								<th width="12%">
									电话
								</th>
								<th width="13%">
									邮件地址
								</th>
								<th width="11%">
									备注
								</th>
							</tr>
						</table>
					</logic:equal>
					<logic:equal name="refer" value="house">
						<table>
							<tr>
								<th width="5%">
									No
								</th>
								<th width="10%">
									操作
								</th>
								<th width="10%">
									楼号楼层
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
								<th width="10%">
									已住人数
								</th>
								<th width="25%">
									备注
								</th>
							</tr>
						</table>
					</logic:equal>
				</div>
				<div id="selectlistcontextdiv">
					<table>
						<logic:equal name="refer" value="person">
							<logic:iterate id="element" name="liveManageCreateInputReferResult" indexId="index">
								<tr>
									<td width="5%">
										<span><%=index.intValue() + 1 %></span>
									</td>
									<td width="10%">
										<input type="button" class="buttoninlist" value="选择" onclick="formSubmit('../liveManageCreateReferChoose.do','<bean:write name="index"  />')">
									</td>
									<td width="18%">
										<span><bean:write name="element" property="person_num" /></span>
									</td>
									<td width="9%">
										<span><bean:write name="element" property="name" /></span>
									</td>
									<td width="5%">
										<span><bean:write name="element" property="sex" /></span>
									</td>
									<td width="17%">
										<span><bean:write name="element" property="native_place" /></span>
									</td>
									<td width="12%">
										<span><bean:write name="element" property="telephone" /></span>
									</td>
									<td width="13%">
										<span><bean:write name="element" property="email" /></span>
									</td>
									<td width="11%">
										<span><bean:write name="element" property="comment" /></span>
									</td>
								</tr>
							</logic:iterate>
						</logic:equal>
						<logic:equal name="refer" value="house">
							<logic:iterate id="element" name="liveManageCreateInputReferResult" indexId="index">
								<tr>
									<td width="5%">
										<span><%= index.intValue() + 1%></span>
									</td>
									<td width="10%">
										<input type="button" class="buttoninlist" value="选择" onclick="formSubmit('../liveManageCreateReferChoose.do','<bean:write name="index"  />')">
									</td>
									<td width="10%">
										<span><bean:write name="element" property="building_floor" /></span>
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
									<td width="10%">
										<span><bean:write name="element" property="already_num" /></span>
									</td>
									<td width="25%">
										<span><bean:write name="element" property="comment" /></span>
									</td>
								</tr>
							</logic:iterate>
						</logic:equal>
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
