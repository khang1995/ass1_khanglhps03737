
package ass1_khanglhps03737;

import java.util.Scanner;

public abstract class StudentPoly {
    private int MaSV;  
    private  String TenSV;
    private  String NganhHoc;
    private  String LopHoc;
    public StudentPoly() {
    }

    public StudentPoly(int MaSV, String TenSV, String NganhHoc, String LopHoc) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.NganhHoc = NganhHoc;
        this.LopHoc = LopHoc;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getLopHoc() {
        return LopHoc;
    }

    public void setLopHoc(String LopHoc) {
        this.LopHoc = LopHoc;
    }

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }
        int n;
        int[] arr;
    public void setSV(){
        Scanner input= new Scanner(System.in);
                System.out.print("Nhập MaSV:");
                this.MaSV=input.nextInt();
                input.nextLine();
                System.out.print("Nhập TenSv:");
                this.TenSV=input.nextLine();
                System.out.print("Nhập Nganh Hoc:");
                this.NganhHoc=input.nextLine();
                System.out.print("Nhập Lop Hoc:");
                this.LopHoc=input.nextLine(); 
        }
    public void viewSV(){
                System.out.printf("%d \t|%s \t|%s \t|%s",this.MaSV,this.TenSV,this.NganhHoc,this.LopHoc);
    }
    public abstract float diemtb();
}
