import java.util.Scanner;

public class PhanSo {
	
	private int tu;
	private int mau;
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	public PhanSo(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}
	
	public PhanSo() {
		
	}
	public int nhapSo() {
		Scanner sc = new Scanner(System.in);
		int num ;
		while(true) {
			try {
				num = sc.nextInt();
				break;
			}
			catch(Exception e) {
				String temp = sc.nextLine();
				System.out.println("Sai dinh dang, vui long nhap lai: ");
			}
		}
		return num;
	}
	
	public void nhapPhanSo() {
		System.out.println("Tu so: ");
		this.tu = nhapSo();
		while(true) {
			System.out.println("Mau So: ");
			this.mau = nhapSo();
			if(this.mau != 0) break;
			else System.out.println("Mau phai khac 0, vui long nhap lai!");
		}
				
	}
	public void hienThi() {
		if(this.tu*this.mau > 0) {
			System.out.println(Math.abs(this.tu) + ((this.mau == 1) ? "" : "/" + Math.abs(this.mau)));
		}else if(this.tu*this.mau <0){
			System.out.println("-" + Math.abs(this.tu) + ((this.mau == 1) ? "" : "/" + Math.abs(this.mau)));
		}else {
			System.out.println("Phan so co gia tri = 0");
		}
		
	}
	public void nghichDao() {
		if(this.tu == 0) {
			System.out.println("Ham khong the nghich dao!");
		}else {
			int tam = this.mau;
			this.mau = this.tu;
			this.tu = tam;
		}
	}
	public PhanSo giaTriNghicDao() {
		PhanSo tam = new PhanSo();
		tam.setTu(this.mau);
		tam.setMau(this.tu);
		return tam;
	}
	public float giaTriPhanSo() {
		return (float)this.tu / this.mau;
	}
	public boolean lonHon(PhanSo a) {
		if(a.giaTriPhanSo()<this.giaTriPhanSo())return false;
		return true;
	}
	public PhanSo congPhanSo(PhanSo a) {
		PhanSo tong = new PhanSo();
		tong.setTu(this.tu*a.mau +a.tu*this.mau);
		tong.setMau(this.mau*a.mau);
		return tong;
		
	}
	public PhanSo truPhanSo(PhanSo a) {
		PhanSo tong = new PhanSo();
		tong.setTu(this.tu*a.mau -a.tu*this.mau);
		tong.setMau(this.mau*a.mau);
		return tong;
		
	}
	public PhanSo nhanPhanSo(PhanSo a) {
		PhanSo tong = new PhanSo();
		tong.setTu(this.tu*a.mau);
		tong.setMau(this.mau*a.mau);
		return tong;
		
	}
	public PhanSo chiaPhanSo(PhanSo a) {
		PhanSo tong = new PhanSo();
		tong.setTu(this.tu*a.mau);
		tong.setMau(this.mau*a.tu);
		return tong;
		
	}
	
	
	
}
