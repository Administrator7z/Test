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

    <script type="text/javascript">
        function sendAsyncRequest() {
            var xmlHttp = new XMLHttpRequest();
            xmlHttp.onreadystatechange = function () {
                //alert(xmlHttp.readyState + "---" + xmlHttp.status);
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    document.getElementById("mydiv").innerHTML = xmlHttp.responseText;
                }
            }

            xmlHttp.open("get","${pageContext.request.contextPath}/ajax");
            xmlHttp.send();
        }
    </script>
</head>
<body>
<input type="button" value="发送异步请求" onclick="sendAsyncRequest()">
<div id="mydiv">等待</div>
</body>
</html>
