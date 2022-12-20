package bean;

public class giohangbean {
	String magiay, tengiay;
	long gia, soLuong, thanhtien;
	String anh;
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giohangbean(String magiay, String tengiay, long gia, long soLuong, String anh) {
		super();
		this.magiay = magiay;
		this.tengiay = tengiay;
		this.gia = gia;
		this.soLuong = soLuong;
		this.thanhtien = soLuong*gia;
		this.anh = anh;
	}

	public String getMagiay() {
		return magiay;
	}
	public void setMagiay(String magiay) {
		this.magiay = magiay;
	}
	public String getTengiay() {
		return tengiay;
	}
	public void setTengiay(String tengiay) {
		this.tengiay = tengiay;
	}

	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}
	public long getThanhtien() {
		return soLuong*gia;
	}
	
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
	
}
