package bean;

public class giaybean {
	private String magiay;
	private String tengiay;
	private String mieuta;
	private long soLuong;
	private long gia;
	private String anh;
	private String maLoai;
	public giaybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giaybean(String magiay, String tengiay, String mieuta, long soLuong, long gia, String anh, String maLoai) {
		super();
		this.magiay = magiay;
		this.tengiay = tengiay;
		this.mieuta = mieuta;
		this.soLuong = soLuong;
		this.gia = gia;
		this.anh = anh;
		this.maLoai = maLoai;
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
	public String getMieuta() {
		return mieuta;
	}
	public void setMieuta(String mieuta) {
		this.mieuta = mieuta;
	}
	public long getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	
	
	
}