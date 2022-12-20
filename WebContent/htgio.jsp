<%@page import="bean.giohangbean"%>
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
  	
  	<style type="text/css">
  		.htgio-img-title {
			width: 70px;
			height: 70px;
			object-fit: cover;
			border-radius: 50%;
		}
		
		.row-item {
			border: 1px solid #999;
			height: 50px;
		}
		
		.test {
			font-size: 24px;
			font-weight: 400;
			cursor: pointer;
			color: red;
		}
		.test:link {
			text-decoration: none;
		}
		
		.btn-action {
			display: flex;
			justify-content: center;
		}
		
		.btn-action-1 + .btn-action-1 {
			margin-left: 40px;
		}
		
		.btn-action-1 {
			font-size: 18px;
			color: #fff;
			border: 1px solid #111;
			border-radius: 6px;
			padding: 8px 12px;
			background-color: #337AB7;
			
		}
		
		.btn-action-1:hover {
			text-decoration: none;
			cursor: pointer;
		}
		
		.input-quantity {
			width: 42px;
			
		}
		
		
  	</style>
</head>
<body>
	<% 		
	giohangbo gh = (giohangbo) session.getAttribute("gio"); %>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
    		<div class="navbar-header">
      			<a class="navbar-brand" href="htgiay">Trang Chủ</a>
    		</div>
		    <ul class="nav navbar-nav">
			      <li class="active">
			      	<a href="giohang">Giỏ Hàng(
			      	<%=gh.countBook() %>
			      	)
			      	</a></li>
			
			      <li><a href="lichsu">Lịch sử mua hàng</a></li>
			      <li><a href="#"><%=session.getAttribute("Sum")%></a></li>
		    </ul>
		    
		    <form class="navbar-form navbar-left">
				 <input type="text" class="form-control" placeholder="Tìm kiếm ở đây" name="search">
		 		<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		    <ul class="nav navbar-nav navbar-right">
			      <li><a href="removesession.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			      <li>
			      <% if (session.getAttribute("login") == null){ %>
			    	 <a href="dangnhap.jsp"><span class="glyphicon glyphicon-user"></span>Log In</a>
			      <%}else{ %>
			    	 <a href="#"><span class="glyphicon glyphicon-user">
			    	 	<%=session.getAttribute("login") %>
			    	 	</span>
			    	 </a>
			      <%} %>
			      
			      
			      
			      </a></li>
		    </ul>
  		</div>
	</nav>
	
	<div class="container">
		<div class="container-fluid container">
		    <ul class="list-group list-item">
			<%-- 		<%
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("uft-8");
				//loaibo loai = new loaibo();
				ArrayList<loaibean> loai = (ArrayList<loaibean>)request.getAttribute("dsloai");
					for(loaibean l: loai/*loai.getloai()*/){%>
						<li class=""><a class="list-group-item" href="htsach?ml=<%=l.getMaLoai()%>">
						<%=l.getTenLoai()%></a></li>
					<%
					}
				%> --%>
		    </ul>
		    
		    
		    <table width="600" style="padding: 0 15px" >
		    	<tr>
		    		<td></td>
		    		<td></td>
		    		<td>Tên </td>
		    		<td>Số lượng</td> 	
		    		<td>Giá</td>
		    		<td>Thành tiền</td>
		    	</tr>
		   		<%	
		   			
		   			long tongTien = 0;
		   			if (gh.ds.size() == 0){
						response.sendRedirect("htgiay");
					}
		   			for (giohangbean item: gh.ds){ 
		   				tongTien += item.getThanhtien();	
		   			%>
		   				<tr class="row-item">
		   					<td>
			   					<input type="checkbox" name="delete" form="form-1" value="<%=item.getMagiay()%>"/>
			   				</td>
		   					<td>
		   						<img src="<%=item.getAnh()%>" class="htgio-img-title"/> 
			   				</td>
			   				<td>
			   					<%=item.getTengiay() %>
			   				</td>
			   				<td>
			   					<form method="post" action="giohang?ms4=<%=item.getMagiay()%>">
			   						<input type="number" name="quantity" min="1" value="<%=item.getSoLuong()%>" class="input-quantity"/>
			   						
			   						<input type="submit" name="submit" value="Cập nhật"/>
			   					</form>
			   				</td>
			   				<td>
			   					<%=item.getGia() %>
			   				</td>
			   				<td>
			   					<%=item.getThanhtien() %>
			   				</td>
			   				<td>
			   					<a class="test" href="giohang?ms=<%=item.getMagiay() %>&remove=1">&times</a>
			   				</td>
			   				
			   				
		   				</tr>
		   			<%}%>
		   			<tr>
		   				<td style="font-size: 24px; font-weight: bold;" colspan="2">Tổng tiền: </td>
		   				<td style="font-size: 24px; font-weight: bold"><%=tongTien %></td>
		   				<td>
		   					<form id="form-1" method="post" action="giohang?suanhieu=true&">
		   						<input type="submit" value="Xóa đã chọn"/>
		   					</form>
		   				</td>
		   			</tr>
	   		 </table>
		
		</div>
			
	</div>
	<div class="btn-action">
		<a class="btn-action-1" href="giohang?removeall=true">Trả lại toàn bộ</a>
		<a class="btn-action-1" href="htgiay">Tiếp tục mua hàng</a>
		<a class="btn-action-1" href="thanhtoan">Thanh toán</a>
	</div>
	

</body>
</html>