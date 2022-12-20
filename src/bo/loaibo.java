package bo;

import java.util.ArrayList;

import bean.khachhangbean;
import bean.loaibean;
import dao.loaidao;

public class loaibo {
	loaidao ldao = new loaidao();
	ArrayList<loaibean> ds ;
	public ArrayList<loaibean> getloai(){
		ds = ldao.getloai();
		return ds;
	}
	public int Themloai(String maloai,String tenloai) {
		try {
			return ldao.themloai(maloai, tenloai);
		} catch (Exception e) {
			return 0;
		}
	}

	
	public int Xoa(String maloai) {
		try {
			return ldao.xoa(maloai);
		} catch (Exception e) {
			return 0;
		}
	}
	public int update(String ten, String maloai1, String maloai) {
		try {
			return ldao.update(ten, maloai1,maloai);
		} catch (Exception e) {
			return 0;
		}
	}
}
