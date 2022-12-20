package dao;

import java.util.Date;

import bo.hoadonbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class hoadon {
	public int mahoadon() {
		try {
			CoSodao cs= new CoSodao();
			cs.KetNoi();
			String sql="select max(mahoadon) as mahd from Hoadon";
			PreparedStatement cmd= cs.cn.prepareStatement(sql);
			ResultSet rs= cmd.executeQuery();
			int kq=0;
			if(rs.next()) {
				kq=rs.getInt("mahd");
			}
			rs.close(); cs.cn.close();
			return kq;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}
	public int Them(int makh) {
		try {
			CoSodao cs= new CoSodao();
			cs.KetNoi();
			String sql="insert into Hoadon(makh,ngaymua,damua) values(?,?,?)";
			PreparedStatement cmd= cs.cn.prepareStatement(sql);
			cmd.setInt(1, makh);
		
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			Date d = new Date();
			Date ngay = dd.parse(dd.format(d));
			cmd.setDate(2, new java.sql.Date(ngay.getTime()));
			cmd.setBoolean(3, false);
			int kq= cmd.executeUpdate();
			cs.cn.close();
			return kq;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		hoadonbo dh  = new hoadonbo();
		int a = dh.them(23);
		System.out.println(a);
	}

}
