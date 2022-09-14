import java.util.Scanner;

public class SDDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		a.hienThi();
		Diem b = new Diem();
		b.nhap();
		b.hienThi();
		
		Diem c = new Diem(b.getX(), b.getY());
		c.layDoiXung();
		c.hienThi();
		System.out.println("Tu B toi O : " + b.khoangCach());
		System.out.println("Tu A den B : " + a.khoangCach(b));
		
		Diem ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu n: ");
		int n = sc.nextInt();
		ds = new Diem[n];
		for(int i =0;i<n;i++) {
			ds[i] = new Diem();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu "+i);
			ds[i].nhap();
		}
		for(int i=0;i<n;i++) {
			ds[i].hienThi();
		}
	}

}
