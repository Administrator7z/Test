<%--
  Created by IntelliJ IDEA.
  User: beyon
  Date: 2021/2/19
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $("button").click(function(){
                $.ajax({
                    url:"ajax.do",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    dataType:"json",
                    //dataType:"text",
                    success:function(resp){
                        //resp从服务器端返回的是json格式的字符串 {"name":"zhangsan","age":20}
                        //jquery会把字符串转为json对象， 赋值给resp形参。

                        // [{"name":"李四同学","age":20},{"name":"张三","age":28}]
                        //alert(resp.name + "    "+resp.age);

                        /*$.each(resp,function(i,n){
                            alert(n.name+"   "+n.age)
                        })*/
                        alert("返回的是文本数据："+resp);

                    }
                })
            })
        })
    </script>
</head>
<body>
<a href="${pageContext.request.contextPath}/some.do">some.do</a>

<form action="more.do" method="post">
    姓名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit" value="提交">
</form>

<form action="much.do" method="post">
    姓名<input type="text" name="uname"><br/>
    年龄<input type="text" name="uage"><br/>
    <input type="submit" value="提交">
</form>

<form action="many.do" method="post">
    姓名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit" value="提交">
</form>
<form action="multi.do" method="post">
    姓名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit" value="提交">
</form>
<button id="btn">发ajax请求</button>
</body>
</body>
</html>
