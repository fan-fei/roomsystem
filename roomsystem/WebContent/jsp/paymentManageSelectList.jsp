<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
<head>
    <html:base />
    <title>公寓管理系统-租金管理--检索一览画面</title>
    <link rel="stylesheet" type="text/css" href="styles/styles.css">
    <script type="text/javascript" src="javascript/javascript.js"></script>
</head>
<body>
    <div id="globaldiv">
        <%@include file="header.inc"%>
        <div id="messagediv">
            <br>
            <div id="pagehint">
                租金管理--检索一览画面
            </div>
            <hr>
            <div id="operatehint">
                请选择相应行进行修改或删除！
            </div>
            <br>
        </div>
        <div id="bodydiv">
            <html:form action="/paymentManageSelectListBack">
                <div id="selectlistheaderdiv">
                    <table>
                        <tr>
                            <th width="7%" rowspan="2">No</th>
                            <th width="9%" rowspan="2">操作</th>
                            <th width="14%">身份证号</th>
                            <th width="10%">姓名</th>
                            <th width="10%">楼号楼层 </th>
                            <th width="10%"> 房间号码</th>
                            <th width="10%">租金</th>
                            <th width="10%">水费</th>
                            <th width="10%">电费</th>
                            <th width="10%">网费</th>
                        </tr>
                        <tr>
                            <th width="10%">杂费 </th>
                            <th width="10%">暖费 </th>
                            <th width="10%">合计 </th>
                            <th width="10%">房间押金</th>
                            <th width="10%">交租日期 </th>
                            <th width="10%">开始日期 </th>
                            <th width="10%">结束日期</th>
                            <th width="10%">备注</th>
                        </tr>
                    </table>
                </div>
                <div id="selectlistcontextdiv">
                    <table>
                        <logic:iterate id="element" name="paymentManageSelectInputSelectResult" indexId="index">
                            <tr>
                                <td width="7%" rowspan="2" align="center">
                                    <span><%= index.intValue() + 1 %></span>
                                </td>
                                <td width="9%" rowspan="2">
                                	<input type="button" class="buttoninlist" value="修改" onclick="formSubmit('../paymentManageSelectListModify.do','<bean:write name="index"  />')">
                                	<input type="button" class="buttoninlist" value="删除" onclick="formSubmit('../paymentManageSelectListDelete.do','<bean:write name="index"  />')">
                                </td>
                                <td width="14%">
                                    <span><bean:write name="element" property="person_num" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="name" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="building_floor" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="house_num" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="room_rent" /></span>
                                </td>
                                <td width="10%">
                                	<span><bean:write name="element" property="water_charge" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="power_charge" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="cable_charge" /></span>
                                </td>
                            </tr>
                            <tr>
                                <td width="10%">
                                    <span><bean:write name="element" property="extra_charge" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="heating_charge" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="total_charge" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="room_deposit" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="pay_date" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="start_date" /></span>
                                </td>
                                <td width="10%">
                                    <span><bean:write name="element" property="end_date" /></span>
                                </td>
                                <td width="10%">
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
