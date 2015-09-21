
package ass1_khanglhps03737;

public class StudentPolyList {
    private StudentPolyNganhMobile dssv[]=new StudentPolyNganhMobile[100];
    private int Sosv=0;
    private int i;
    public void ThemSV(StudentPolyNganhMobile mb){
            dssv[Sosv]=mb;
            Sosv++;
    }
    public void XoaSV(int Masv){
        if (Masv>Sosv) {
                    System.out.println("Không có trong danh sách , không thể xoá.");
                }
            for (int i =0; i < Sosv; i++) {
                if (dssv[i].getMaSV()==Masv) {
                    dssv[i]=dssv[i+1];
                    Sosv--;
                    System.out.println("Đã Xoá Mã SV"+Masv+"Thành công.");
                }
            }
    }
    public void TimSv(int Masv){
        if (Masv>Sosv) {
                
                System.out.println("Không có trong danh sách , không tìm thấy.");
                }
            for (int i =0; i < Sosv; i++) {
                if (dssv[i].getMaSV()==Masv) {
                    System.out.println("Mã SV \t|Tên SV \t|Ngành học \t|Lớp học \t|Điểm Java \t|Điểm Android \t|Điểm dự án \t|Điểm trung bình ");
                    dssv[i].viewSV();
                }
            }
    }
    public void XuatDssv(){
        for (int i = 0; i < Sosv; i++) {
            dssv[i].viewSV();
        }
    }
    private void SapxepBXH(){
        StudentPolyNganhMobile temp;
        int min;
        for (int i = 0; i < Sosv-1; i++) {
            min=i;
            for (int j = 1; j < Sosv; j++) {
                if (dssv[j].diemtb()>dssv[i].diemtb()) {
                    min=j;
                }
            }
            temp=dssv[i];
            dssv[i]=dssv[min];
            dssv[min]=temp;
        }
    }
    public  void BXH(){
        SapxepBXH();
        System.out.println("-----------------------------------------BANG XEP HANG--------------------------------------------");
        XuatDssv();
    }
    public void DssvKhenThuong(int n){
        SapxepBXH();
        System.out.println("-----------------------------------------DANH SÁCH SV KHEN THƯỞNG--------------------------------------------");
        for (int i = 0; i < n; i++) {
            dssv[i].viewSV();
            System.out.print("\t"+dssv[i].diemtb()+"\n");
        }
    }
    public void DssvHotro(int n){
        SapxepBXH();
        System.out.println("-----------------------------------------DANH SÁCH SV KHEN THƯỞNG--------------------------------------------");
        int k=Sosv-n;
        for (int i =Sosv-1; i < k; i++) {
            dssv[i].viewSV();
            System.out.print("\t"+dssv[i].diemtb());
            System.out.println("");
        }
    }
}
