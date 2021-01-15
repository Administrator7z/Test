<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-01-15
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function calculator() {
            var myname = document.getElementById("myname").value;
            var height = document.getElementById("height").value;
            var weight = document.getElementById("weight").value;
            var xmlHttp = new XMLHttpRequest();
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    document.getElementById("mydiv").innerHTML = xmlHttp.responseText;
                }
            }
            var param = "?myname=" + myname + "&height=" + height + "&weight=" + weight;
            xmlHttp.open("get","${pageContext.request.contextPath}/bmi"+param);
            xmlHttp.send();
        }
    </script>
</head>
<body>
姓名:<input id="myname"><br>
身高:<input id="height"><br>
体重:<input id="weight"><br>
<input type="button" value="计算" onclick="calculator()">
<div id="mydiv">等待服务器返回bmi计算结果</div>
</body>
</html>
