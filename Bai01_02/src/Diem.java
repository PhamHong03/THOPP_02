import java.util.Scanner;

public class Diem {
	
	private int x;
	private int y;
	
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
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public Diem() {
	         
	}
	public Diem(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void nhap() {
	
		System.out.println("Nhap x");
		this.x = nhapSo();
		System.out.println("Nhap y");
		this.y = nhapSo();
	}

	public void hienThi() {
		System.out.println("("+this.x+";"+this.y+")");

	}

	public void doiDiem(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public int giaTriX() {
		return this.getX();
	}

	public int giaTriY() {
		return this.getY();
	}
	
	public float congThuc(){
        return (float) Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public float khoangCach(){
        return this.congThuc();
    }
    
    public float congThuc(Diem d){
    	int dx = d.getX();
    	int dy = d.getY();
        return (float) Math.sqrt(((Math.pow(this.x - dx,2)) + ((Math.pow(this.y - dy,2)))));
    }

    public float khoangCach(Diem d){
        return this.congThuc(d);
    }
    
    public void layDoiXung() {
    	this.x = -this.x;
    	this.y = -this.y;
    }
    
    public Diem doixung() {
    	return new Diem(-x,-y);                      
    }
    
}
