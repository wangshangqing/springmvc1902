<%--
  Created by IntelliJ IDEA.
  User: wangsq
  Date: 2020/9/1
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-3.3.1.min.js"></script>

    <script>
        function test(){
            var s=JSON.stringify({stuName:'zhangsan',sex:'1'})

            $.ajax({
                type:"post",
                url:'/test/query.do',
                data:s,
                contentType:'application/json'
            })
        }
    </script>
</head>
<body>

<form method="" action="">
    <input type="hidden" name="_method" value="DELETE">
</form>


</body>
</html>
