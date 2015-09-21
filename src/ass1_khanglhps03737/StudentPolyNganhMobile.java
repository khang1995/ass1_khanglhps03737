
package ass1_khanglhps03737;

import java.util.Scanner;

public class StudentPolyNganhMobile extends StudentPoly{
    public float diemjava;
    public float diemandroid;
    public float diemduan;
    public StudentPolyNganhMobile(){
        super(0,null,null,null);
        diemjava=0;
        diemandroid=0;
        diemduan=0;
    }
    public StudentPolyNganhMobile(float diemjava, float diemandroid, float diemduan, int MaSV, String TenSV, String NganhHoc, String LopHoc) {
        super(MaSV, TenSV, NganhHoc, LopHoc);
        this.diemjava = diemjava;
        this.diemandroid = diemandroid;
        this.diemduan = diemduan;
    }
    @Override
    public void viewSV() {
        super.viewSV();
        System.out.print("\t|"+diemjava);
        System.out.print("\t\t|"+diemandroid);
        System.out.print("\t\t|"+diemduan);
        System.out.print("\t\t|"+diemtb()+"\n");
    }
    @Override
    public void setSV() {
        Scanner input=new Scanner(System.in);
        super.setSV();
        System.out.print("Nhập điểm Java:");
        this.diemjava=input.nextFloat();
        System.out.print("Nhập điểm Android:");
        this.diemandroid=input.nextFloat();
        System.out.print("Nhập điểm Dự án:");
        this.diemduan=input.nextFloat();
    }
    
    @Override
    public float diemtb() {
        return (diemandroid+diemduan+diemjava)/3;
    }
    
    
}
