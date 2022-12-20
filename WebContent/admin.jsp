<%@page import="bean.dnadminbean"%>

<%@page import="bean.lichsubean"%>
<%@page import="bean.khachhangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.giaybo"%>
<%@page import="bean.giaybean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.giaydao"%>
<%@page import="bean.loaibean"%>
<%@page import="dao.loaidao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>AJax</title>
	<meta charset="utf-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" type="text/css" href="./assets/css/main.css">
  	

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="admin">Trang chủ</a></li>
      
      <li><a href="loaiadmin">Quản lý loại</a></li>
      <li><a href="sachadminController">Quản lý sách</a></li>
      <li><a href="xacnhanadmin">Xác nhận</a></li>
      <li><a href="danhsachchuyentien">danh sách chuyển tiền</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li>
      <%if(session.getAttribute("admin")==null){ %>
      <a href="admindn">
      <span class="glyphicon glyphicon-log-in"></span>
       Login
       </a>
       <%}else{ %>
       <a href="">
	      <span class="glyphicon glyphicon-log-in"></span>
	       Hi: <%
	     	dnadminbean kh =(dnadminbean)session.getAttribute("admin");
	        out.print(kh.getTenDangNhap());
	       %>
	       </a>
	       <%} %>
       </li>
    </ul>
  </div>
</nav>

 <table width="600" style="padding: 0 15px" >
		    	
	  </table>


		
</body>
</html>