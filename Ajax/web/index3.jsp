<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-01-15
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").on("click",function () {
                var n=$("#myname").val();
                var h=$("#height").val();
                var w=$("#weight").val();
                $.ajax({
                    url:"${pageContext.request.contextPath}/bmi",
                    data:{"myname":n,"height":h,"weight":w},
                    type:"get",
                    dataType:"text",
                    success:function (res) {
                        $("#mydiv").html(res);
                    }
                });
            });
        });
    </script>?
</head>
<body>
<body>
姓名:<input id="myname"><br>
身高:<input id="height"><br>
体重:<input id="weight"><br>
<input type="button" value="计算" id="btn">
<div id="mydiv">等待服务器返回bmi计算结果</div>
</body>
</body>
</html>
