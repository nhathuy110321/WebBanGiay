<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
	 <li class="active"><a href="admin">Trang chủ</a></li>
      
      <li><a href="loaiadmin">Quản lý loại</a></li>
      <li><a href="sachadminController">Quản lý sách</a></li>
      <li><a href="xacnhanadmin">Xác nhận</a></li>
      <li><a href="danhsachchuyentien">danh sách chuyển tiền</a></li>

	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a href="action_gh?xoaAll=true"><span class="glyphicon glyphicon-log-in"></span> Sign Up</a></li>
	      <li><a href="admindn"><span class="glyphicon glyphicon-user"></span> Login</a></li>
	    </ul>
	  	</div>
</nav>

	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	%>
	<table style="margin-top: 60px">
		<form method="post" action="upsach" enctype= "multipart/form-data">
<!-- 		Tên Sách: <input type="text" name="txthoten" value=""> <br>
			Số Lượng: <input type="text" name="txtdiachi" value=""> <br> -->
			Mã Sách: <input style="margin-left: 20px; margin-bottom: 10px" type="text" name="txtms" value=""> <br>
			Tên Sách: <input style="margin-left: 16px; margin-bottom: 10px" type="text" name="txttensach" value=""> <br>
			Số Lượng: <input style="margin-left: 13px; margin-bottom: 10px" type="text" name="txtsl" value=""> <br>
			Giá: <input style="margin-left: 54px; margin-bottom: 10px" type="text" name="txtgia" value=""> <br>
			Loai: <input style="margin-left: 48px; margin-bottom: 10px" type="text" name="txtloai" value=""> <br>
			So Tap: <input style="margin-left: 31px; margin-bottom: 10px" type="text" name="txtsotap" value=""> <br>
			Tác giả: <input style="margin-left: 29px; margin-bottom: 20px" type="text" name="txttacgia" value=""> <br>
			file: <input type="file" name="txtfile" style="display: inline-block;"><br>
		<input type="submit"> 
	</form> 
	</table>

</body>
</html>