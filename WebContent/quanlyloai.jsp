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
<!DOCTYPE html>
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
<%ArrayList<loaibean> loai = (ArrayList<loaibean>)request.getAttribute("dsloai"); %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="admin">Trang chủ</a></li>
      
      <li><a href="loaiadmin">Quản lý loại</a></li>
      <li><a href="sachadminController">Quản lý sản phẩm</a></li>
      <li><a href="xacnhanadmin">Xác nhận</a></li>
      <li><a href="danhsachchuyentien">danh sách chuyển tiền</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li>
      <%if(session.getAttribute("admin")==null){ %>
      <a href="dangnhapadmin">
      <span class="glyphicon glyphicon-log-in"></span>
       Login
       </a>
       <%}else{ %>
       <a href="#">
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
<h3>Thêm loại	</h3>
<table  width="1000" align="center"  style="padding: 0 15px"  border="1" >
				
			<form  method="post" action="loaiadmin">
					<label for="uname"><b>Nhâp mã</b></label>
				    <input type="text" placeholder="Mã " name="txtma" value="">
					<br>
				    <label for="psw"><b>Nhập tên </b></label>
				    <input type="text" placeholder="Nhập tên" name="txtten" required>	
				    <input type="submit" name="add" value="Thêm"/>
				    	
			</form>

</table>		
	<h3>Danh sách loại</h3>
 <table  width="1000" align="center"  style="padding: 0 15px"  border="1" >
		    	<tr>
		    		
		    		<td>Mã Loại</td>
		    		<td>Tên Loại</td> 	
		    		<td>Cập nhập </td>
		    		<td>Xóa</td>
		    	</tr>
		    	<%
		    	for(loaibean o: loai){%>
		   		<tr >
		   			
			   	<form method="post" action="loaiadmin?update=<%=o.getMaLoai()%>">
			   		<td>
			   		<input type="text" name="ml"  value="<%=o.getMaLoai()%>" class="input-quantity"/>
			   		</td>
			   		<td>
			   		<input type="text" name="ten"  value="<%=o.getTenLoai()%>" class="input-quantity"/>
			   		</td>
			   		
			   		<td>
			   		<input type="submit" name="submit" value="Cập nhật"/>
			   		</td>			
			   		
			   	</form>
			   		</td>
			   		<td><a href="loaiadmin?xoa=<%=o.getMaLoai()%>">XOÁ</a></td>
		   		</tr>
		   		<%} %>
	  </table>
	  <br>


</body>
</html>