package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds = new ArrayList<giohangbean>();
	public void Them(String magiay, String tengiay, long gia, long soLuong, String anh) {
		for (giohangbean g:ds) {
			if (g.getMagiay().equals(magiay)) {
				g.setSoLuong(soLuong+ g.getSoLuong());
				return;
			}
		}
		
		ds.add(new giohangbean(magiay, tengiay, gia, soLuong, anh));
		
	}
	
	public void Xoa(String ma) {
		for (int i=0; i<ds.size(); i++) {
			if (ds.get(i).getMagiay().equals(ma)) {
				ds.remove(i);
				return;
			}
		}
	}
	
	public void XoaAll() {
		ds.removeAll(ds);
	}
	
	public long TongTien() {
		long Sum = 0;
		for (giohangbean g: ds) {
			Sum += g.getThanhtien();
		}
		return Sum;
	}
	
	public int countBook() {
		int count = 0;
		for (giohangbean g: ds) {
			count++;
		}
		
		return count;
	}
	
	public void XoaNhieu(String [] list) {
		for (String item: list) {
			for (int i=0; i<ds.size(); i++) {
				if (item.equals(ds.get(i).getMagiay())) {
					ds.remove(i);
					i--;
				}
			}
		}
	}
	public void sua(String masach, long sl) {
		for(int i =0; i< ds.size(); i++) {
			if(ds.get(i).getMagiay().equals(masach)) {
				ds.get(i).setSoLuong(sl);;
			}
		}
	}
}
