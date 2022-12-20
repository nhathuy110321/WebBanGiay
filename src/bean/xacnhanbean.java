package bean;

import java.sql.Date;

public class xacnhanbean {
	private long MaChiTietHD;
	private long MaHoaDon;
   private String hoten;
   private String tengiay;
   private long SoLuongMua;
   private long gia;
   private long ThanhTien;
   private boolean damua;
public xacnhanbean() {
	super();
	// TODO Auto-generated constructor stub
}
public xacnhanbean(long maChiTietHD, long maHoaDon, String hoten, String tengiay, long soLuongMua, long gia,
		long thanhTien, boolean damua) {
	super();
	MaChiTietHD = maChiTietHD;
	MaHoaDon = maHoaDon;
	
	this.hoten = hoten;
	this.tengiay = tengiay;
	SoLuongMua = soLuongMua;
	this.gia = gia;
	ThanhTien = thanhTien;
	
	this.damua = damua;
}
public long getMaChiTietHD() {
	return MaChiTietHD;
}
public void setMaChiTietHD(long maChiTietHD) {
	MaChiTietHD = maChiTietHD;
}
public long getMaHoaDon() {
	return MaHoaDon;
}
public void setMaHoaDon(long maHoaDon) {
	MaHoaDon = maHoaDon;
}


public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}

public String getTengiay() {
	return tengiay;
}
public void setTengiay(String tengiay) {
	this.tengiay = tengiay;
}
public long getSoLuongMua() {
	return SoLuongMua;
}
public void setSoLuongMua(long soLuongMua) {
	SoLuongMua = soLuongMua;
}
public long getGia() {
	return gia;
}
public void setGia(long gia) {
	this.gia = gia;
}
public long getThanhTien() {
	return ThanhTien;
}
public void setThanhTien(long thanhTien) {
	ThanhTien = thanhTien;
}

public boolean isDamua() {
	return damua;
}
public void setDamua(boolean damua) {
	this.damua = damua;
}

}
