package bo;

import java.sql.Date;
import java.util.ArrayList;

import bean.giaybean;
import dao.giaydao;

public class giaybo {
	giaydao lgiay = new giaydao();
	ArrayList<giaybean> ds;
	
	public ArrayList<giaybean> getgiay(){
		ds = lgiay.getgiay();
		
		return ds;
	}
	
	public ArrayList<giaybean> timKiemTheoLoai(ArrayList<giaybean> ds ,String maLoai) {
		ArrayList<giaybean> dsSachCungMa = new ArrayList<giaybean>();
		for (giaybean item: ds) {
			if (item.getMaLoai().equals(maLoai)) {
				dsSachCungMa.add(item);
			}
		}
		
		return dsSachCungMa;
	}
	
	public ArrayList<giaybean> timKiemTheoTen(ArrayList<giaybean> ds ,String ten) {
		ArrayList<giaybean> dsCungTen = new ArrayList<giaybean>();
		for (giaybean item: ds) {
			if (item.getTengiay().toLowerCase().trim().contains(ten.toLowerCase().trim())
			 || item.getMaLoai().toLowerCase().trim().contains(ten.toLowerCase().trim())
			) {
				dsCungTen.add(item);
			}
		}
		
		return dsCungTen;
	}
	
	
//	public void them_sach(giaybean s, String sotap, Date date) {
//		try {
//			lsach.them(s, sotap, date);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

	//}
}
