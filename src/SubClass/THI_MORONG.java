package SubClass;
import SuperClass.Nguoi;
import java.io.Serializable;
import java.util.Scanner;
public class THI_MORONG extends Nguoi implements Serializable {
	public String MaGD;
    public float HSL;
    public float Luong;
    public int LCB;
    public THI_MORONG() {
	}
	public THI_MORONG(String sHoten, String sSDT, boolean bGioitinh, String sEmail, String MaGD, float HSL, float Luong, int LCB) {
		super(sHoten, sSDT, bGioitinh, sEmail);
		this.MaGD=MaGD;
		this.HSL=HSL;
		this.Luong=Luong;
		this.LCB=LCB;
	}
	public String getMaGD() {
		return MaGD;
	}
	public void setMaGD(String maGD) {
		MaGD = maGD;
	}
	public float getHSL() {
		return HSL;
	}
	public void setHSL(float hSL) {
		HSL = hSL;
	}
	public float getLuong() {
		return Luong;
	}
	public void setLuong(float luong) {
		Luong = luong;
	}
	public int getLCB() {
		return LCB;
	}
	public void setLCB(int lCB) {
		LCB = lCB;
	}
	@Override
    public void Nhap()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Ma Giam Doc: ");
    	this.MaGD = sc.nextLine();
    	super.Nhap();
    	System.out.print("Nhap HSL: ");
    	this.HSL = sc.nextFloat();
    	System.out.print("Nhap LCB: ");
    	this.LCB = sc.nextInt();
    	this.Luong = this.HSL*this.LCB;
    }
    @Override
    public void Xuat()
    {
    	System.out.printf("%-10s",this.MaGD);
    	super.Xuat();
    	System.out.printf("%-5.2f %-10d %-10.2f",this.HSL,this.LCB,this.Luong);
    }
}
