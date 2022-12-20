package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.lichsubean;

public class lichsudao {
	public ArrayList<lichsubean> getlichsu(int makh){
        try {
        	ArrayList<lichsubean> ds= new ArrayList<lichsubean>();
        	CoSodao cs = new CoSodao();
    		cs.KetNoi();
            String sql = "select * from Vlichsu where makh = ?";
           	PreparedStatement cmd = cs.cn.prepareStatement(sql);
	    	cmd.setInt(1, makh);
            
            ResultSet rs = cmd.executeQuery();
            
            
            while(rs.next()) {
            	
				String ten = rs.getString("tengiay");
				int SoLuongMua = rs.getInt("SoLuongMua");
				int gia = rs.getInt("gia");
				int ThanhTien = rs.getInt("Thanhtien");
				boolean damua =rs.getBoolean("damua");
				Date NgayMua = rs.getDate("ngaymua");
				
				ds.add(new lichsubean(ten, SoLuongMua, gia, ThanhTien, damua, NgayMua));
            }
            
            rs.close();
			   
            return ds;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
}
