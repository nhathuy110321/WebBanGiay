package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.jdi.connect.spi.Connection;

import bean.loaibean;
import bean.giaybean;

public class giaydao {
	
	

	public ArrayList<giaybean> getgiay() {

		
		try {
			ArrayList<giaybean> dsgiay = new ArrayList<giaybean>();
//			   b1: ket noi vao csdl
			   CoSodao cs = new CoSodao();
			   cs.KetNoi();

			//			   b2: Lay du lieu ve
			   String sql = "select * from Giay";
			   PreparedStatement cmd = cs.cn.prepareStatement(sql);
			   ResultSet rs = cmd.executeQuery();
			   while(rs.next()) {
				   String mgiay = rs.getString("magiay");
				   String tengiay = rs.getString("tengiay");
				   String mieuta = rs.getString("mieuta");
				   long soLuong = rs.getLong("soluong");
				   long gia = rs.getLong("gia");
				   String anh = rs.getString("anh");
				   String maLoai = rs.getString("maloai");
				   dsgiay.add(new giaybean(mgiay, tengiay, mieuta, soLuong, gia, anh, maLoai));

			   }

			   rs.close();
			   cs.cn.close();

			   return dsgiay;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			}
		
		
	}
//	public int them (giaybean s, String sotap, Date date) throws Exception {
//		CoSodao cs = new CoSodao();
//		cs.KetNoi();;
//		
//		String sql = "insert into giay (masach, tensach, soluong, gia, maloai, sotap, anh, NgayNhap, tacgia)\r\n"
//				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		PreparedStatement cmd = cs.cn.prepareStatement(sql);
//		cmd.setString(1, s.getMaSach());
//		cmd.setString(2, s.getTenSach());
//		cmd.setLong(3, s.getSoLuong());
//		cmd.setLong(4, s.getGia());
//		cmd.setString(5, s.getMaLoai());
//		cmd.setString(6, sotap);
//		cmd.setString(7, s.getAnh());
//		cmd.setDate(8, date);
//		cmd.setString(9, s.getTacGia());
//		return cmd.executeUpdate();
//	}
//	
}