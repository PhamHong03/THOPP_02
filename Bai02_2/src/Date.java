import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		
	}
	public void hienThi() {
		System.out.println(this.day+"/"+this.month+"/"+this.year);
		
	}
//	public int nhapSo(int status) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		boolean check = true;
//		while(check) {
//			try {
//				num = sc.nextInt();				
//				switch(status) {
//					case 1:						
//						if(num >= 1 && num <= 31) check = false;			
//						else System.out.println("Ngay khong dung dinh dang!! nhap lai dii");
//						break;						
//					case 2:
//						if(num >= 1 && num <= 12) check = false;			
//						else System.out.println("Thang khong dung dinh dang!! nhap lai dii");
//						break;	
//					case 3:
//						if(num >= 1) check = false;			
//						else System.out.println("Nam khong dung dinh dang!! nhap lai dii");
//						break;	
//				}
//			}
//			catch(Exception e) {
//				String temp = sc.nextLine();
//				System.out.println("Sai dinh dang, vui long nhap lai: ");
//			}
//		}
//		return num;
//	}
	

//	public void nhapDMY() {
//		System.out.println("Nhap ngay: ");
//		this.day = nhapSo(1);
//		System.out.println("Nhap thang: ");
//		this.month = nhapSo(2);
//		System.out.println("Nhap nam: ");
//		this.year = nhapSo(3);
//	}
	
	public boolean hopLe() {
		boolean h = false;
		int max[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		if(year %400 == 0 && (year %4 ==0 || year %100 != 0)) {
			max[2] = 28;
		}
		if(month >0 && month <13 && year > 0 && day>0 && day < 32) {
			day = max[month];
			h = true;
		}
		return false;
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ngay thang nam");
		do {
			day = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
		}while(!hopLe());		
	}
	
	public Date cong() {
		Date a = new Date();
		a.day++;
		if(!a.hopLe()) {
			a.day = 1;
			a.month ++;
			if(!a.hopLe()) {
				a.day = 1;
				a.month = 1;
				a.year++;
			}
		}	
		
		return a;
	}
	
	public Date cong(int n){
		Date a = new Date();
		for(int i =0;i<n;i++) {
			a = a.cong();
		}
		return a;
	}
	
	public int layDay() {
		return this.day;
	}
	public int layMonth() {
		return this.month;
	}
	public int layYear() {
		return this.year;
	}
}
