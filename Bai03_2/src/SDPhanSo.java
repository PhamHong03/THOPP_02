import java.util.Scanner;

public class SDPhanSo {
	
	public static int nhapSo() {
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
	
	public static void main(String[] args) {
//		PhanSo ps1 = new PhanSo(3,7);
//		PhanSo ps2 = new PhanSo(4,9);
//		
//		PhanSo x = new PhanSo();
//		x.nhapPhanSo();
//		PhanSo y = new PhanSo();
//		y.nhapPhanSo();
//		
//		x.giaTriNghicDao().hienThi();
//		
//		x.congPhanSo(y).hienThi();
		System.out.println("Nhap so luong phan tu cua mang: ");
		int n = nhapSo();
		
	
		
		PhanSo arrPs[] = new PhanSo[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan so thu "+ (i+1) +": ");
			arrPs[i] = new PhanSo();
			arrPs[i].nhapPhanSo(); 
		}
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Phan so thu "+ (i+1) +": ");
			arrPs[i].hienThi(); 
		}
		PhanSo tong = new PhanSo(0,1);
		
		for(int i =0;i<n;i++ ) {
			tong = tong.congPhanSo(arrPs[i]);
		}
		System.out.println("Tong ne:");
		tong.hienThi();
		PhanSo max = new PhanSo(Integer.MIN_VALUE, 1);
		for(int i=0;i<n;i++) {
			if(arrPs[i].giaTriPhanSo()>max.giaTriPhanSo()) {
				max = arrPs[i];
			}
		}
		System.out.println("Gia tri lon nhat la: ");
		max.hienThi();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arrPs[i].giaTriPhanSo() > arrPs[j].giaTriPhanSo()) {
					PhanSo tam = arrPs[j];
					arrPs[j] = arrPs[i];
					arrPs[i] = tam;
				}
				
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.printf("Phan so thu "+ (i+1) +": ");
			arrPs[i].hienThi(); 
		}
	}
}
