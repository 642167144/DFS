<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/four.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>

</head>
<body>
	<!-- 包含等待框 -->
	<jsp:include page="../waittable.jsp" flush="true" />
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF"><table width="96%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td colspan="5" class="optiontitle">商品列表</td>
					</tr>
					<tr align="center">
						<td align="center" bgcolor="#ebf0f7">商品名</td>
						<td align="center" bgcolor="#ebf0f7">售价</td>
						<td align="center" bgcolor="#ebf0f7">采购价</td>
						<td align="center" bgcolor="#ebf0f7">类型</td>
						<td align="center" bgcolor="#ebf0f7">操作</td>
					</tr>

					<c:forEach items="${page.results}" var="productTmp">
						<tr align="center" bgcolor="#FFFFFF">
							<td align="center">${productTmp.productName}</td>
							<td align="center">${productTmp.productPrice}</td>
							<td align="center">${productTmp.productRealPrice}</td>
							<c:forEach items="${page2}" var="productTypeTmp">
								<c:if test="${productTmp.productType eq productTypeTmp.typeId}">
									<td align="center">${productTypeTmp.typeName}</td>
								</c:if>
							</c:forEach>
							<td align="center">
							【<a href="updtProduct1.do?productId=${productTmp.productId}">查看</a>】<c:if test="${sessionScope.usr.userType eq 1}">
									|【<a href="updtProduct1.do?productId=${productTmp.productId}">编辑</a>】
								    |【<a href="deleteProduct.do?productId=${productTmp.productId}" class="delete" >删除</a>】
				                   </c:if>
							</td>
						</tr>
					</c:forEach>

					<tr align="right" bgcolor="#ebf0f7">
							<td colspan="5">
							<df:page totalPage="${page.totalPage}" pageNo="${page.pageNo}" totalRecord="${page.totalRecord}"
                                url="/j1107cars/Product/listProduct.do" />
							</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>