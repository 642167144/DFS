<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="df" uri="http://www.jkoss.com/mytaglib"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	background-color: #ecf4ff;
}

.dtree {
	font-family: Verdana, Geneva, Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: #0000ff;
	white-space: nowrap;
}

.dtree img {
	border: 0px;
	vertical-align: middle;
}

.dtree a {
	color: #333;
	text-decoration: none;
}

.dtree a.node, .dtree a.nodeSel {
	white-space: nowrap;
	padding: 1px 2px 1px 2px;
}

.dtree a.node:hover, .dtree a.nodeSel:hover {
	color: #0000ff;
}

.dtree a.nodeSel {
	background-color: #AED0F4;
}

.dtree .clip {
	overflow: hidden;
}
-->
</style>
<link href="css/four.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="dist/themes/default/style.min.css" />
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>

</head>
<script src="dist/jstree.min.js"></script>
<script>
    $(function() {
        var id1 = [], p1 = [], t1 = [], c1 = [];
        // 6 create an instance when the DOM is ready
        $('#jstree').jstree({
                'core' : {
                    'data' : {
                        'url' : 'Product/show.do',
                        dataType : 'json'
                    }
                }
            });
        $('#jstree')
        // listen for event
            .on('changed.jstree', function(e, data) {
                console.log(data.selected);
                var i, j, t = [], id = [], p = [], c = [];
                for (i = 0, j = data.selected.length; i < j; i++) {
                    t.push(data.instance.get_node(data.selected[i]).text);
                    id.push(data.instance.get_node(data.selected[i]).id);
                    p.push(data.instance.get_node(data.selected[i]).parent);
                }
                t1 = t;
                p1 = p;
                id1 = id;
                c1 = c;
                ajaxTest(id);
                $('#event_result').html('Selected: ' + t.join(', '));
            })
            // create the instance
            .jstree();


    });
    function ajaxTest(id) {
        $.ajax({
            type: "GET",
            dataType: 'json',
            url: "Product/find_product.do?productId="+id,
            error: function (data) {
                alert("在数据传输上出现了一点问题！！");
            },
            success: function (data) {
                $.each(data, function (index, element) {
                    $("#show_product").empty();
                    $("<table><td>"+element.productTitle+"</td>" +
						"<td><tr>"+element.productName+"</tr><tr>"+element.productPrice+"</tr><tr>"+element.productRealPrice+"</tr></td>" +
						"<td>"+element.productDetail+"</td>"+
						"</table>").appendTo($("#show_product"))
                });

                $("#result").html(data.msg);
            }
        });
    }

</script>

<body>



	<c:choose>
		<c:when test="${sessionScope.usr.userType eq 1}">
			【<a
				href="mgr/adlgn.do?loginName=${sessionScope.usr.userName}&password=${sessionScope.usr.userPwd}">进入管理系统</a>】
			<a href="mgr/lgout.do">登出</a>
		</c:when>
		<c:otherwise>
			<a href="Login.jsp" style="">登录</a>
		</c:otherwise>
	</c:choose>

<div>
	<div id="jstree"  style="float:left"></div>

	<div id="show_product" style="float:left"></div>
</div>
</body>
</html>