<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf8" />
<link href="../css/four.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../js/jquery.validate.js"></script>
<script type="text/javascript" src="../js/jquery.metadata.js"></script>
<script type="text/javascript">

    $(function(){

    })
</script>	


</head>

<body>
<!-- 包含等待框 -->
	<jsp:include page="../waittable.jsp" flush="true"/> 
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td bgcolor="#FFFFFF">
				<form action="updtProduct2.do" name="myform" id="myform">
					<table width="40%" border="0" align="center" cellpadding="4"
						cellspacing="1" bgcolor="#aec3de">
						<tr align="center" bgcolor="#F2FDFF">
							<td align="left" colspan="2" class="optiontitle">
								修改用户:${toUpdtProduct.productName}<input type="hidden" name="uid" value="${toUpdtProduct.productId}" />
							</td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">商品名</td>
							<td align="left">  
							<input type="text" name="productName" style="width:160px"  value="${toUpdtProduct.productName}" />
							 </td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">出售价</td>
							<td align="left">  
							<input type="text" name="productPrice" style="width:160px"  value="${toUpdtProduct.productPrice}" />
							 </td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">采购价</td>
							<td align="left">  
							<input type="text" name="productRealPrice" style="width:160px"  value="${toUpdtProduct.productRealPrice}" />
							 </td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">文本</td>
							<td align="left">  
							<input type="text" name="productTitle" style="width:160px"  value="${toUpdtProduct.productTitle}" />
							 </td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">类型</td>
							<td align="left">
								<input type="text" name="productType" style="width:160px"  value="${toUpdtProduct.productType}" />
							</td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">EMail</td>
							<td align="left">
								<input type="text" name="productBrand" style="width:160px"  value="${toUpdtProduct.productBrand}" />
							</td>
						</tr>
						<tr align="center" bgcolor="#F2FDFF">
							<td width="20%" align="right">图标</td>
							<td align="left">
								<input type="file"  name="headImage"  style="width:160px"  value="${toUpdtProduct.headImage}" va />
							</td>
						</tr>
						 
						<tr align="center" bgcolor="#ebf0f7">
							<td colspan="2"><input type="submit" name="Submit" id="Submit"
								value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset"
								name="Submit2" value="重置" />
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>