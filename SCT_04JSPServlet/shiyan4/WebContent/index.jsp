<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单信息的提交</title>
</head>
<body align="center" bgcolor="#00BBFF">
<h1 align="center">学生信息录入</h1>
<form action="chuxun.jsp" method="POST" >
<br />
<br />
<br />
学号：<input type="text" name="name">
<br />
<br />
姓名：<input type="text" name="url" />
<br />
<br />
生日：<input type="date" name="bday">
<br />
<br />
<!--单选框-->
性别:   <input type="radio" name="man" value="女">女  
<input type="radio" name="man" value="男">男
<br/>
<br />
<!--复选框-->
体育爱好:
<br/>
<br/>
 <input type="checkbox" name="sp" value="篮球">篮球
 <input type="checkbox" name="sp" value="跑步">跑步
 <input type="checkbox" name="sp" value="游泳">游泳
<br/>
<br/>
<input type="submit" value="提交" />
<input type="reset"  value="重置" />
<br/>
<br/>
</form>
</body>
</html>