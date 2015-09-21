
package ass1_khanglhps03737;

import java.util.Scanner;

public class Run {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StudentPolyList list=new StudentPolyList();
        int chon;
        do{
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|Phần Mềm Quản Lý Thông Tin SV - ASS - Lâm hữu khang - PS03737       |");
            System.out.println("|1.Thêm SV                                                           |");
            System.out.println("|2.Xoá SV                                                            |");
            System.out.println("|3.Tìm SV                                                            |");
            System.out.println("|4.Xuất DSSV                                                         |");
            System.out.println("|5.Bảng Xếp Loại                                                     |");
            System.out.println("|6.DSSV được khen thưởng                                             |");
            System.out.println("|7.DSSV cần được hỗ trợ                                              |");
            System.out.println("|8.Thoát                                                             |");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Mời bạn chọn:");
            chon=input.nextByte();
            switch (chon) {
                case 1:
                    System.out.println("-----------------------------------------THÊM SINH VIÊN--------------------------------------------");
                    System.out.print("Nhập số học sinh cần nhập:");
                    int nhapsv=input.nextInt();
                    for (int i = 0; i < nhapsv; i++) {
                        StudentPolyNganhMobile mb=new StudentPolyNganhMobile();
                        System.out.println("\nSinh Viên thứ:"+(i+1));
                        System.out.println("");
                        mb.setSV();
                        list.ThemSV(mb);
                    }
                    break;
                case 2:
                    StudentPolyNganhMobile mb=new StudentPolyNganhMobile();
                    System.out.print("Nhập số học sinh cần xoá:");
                    int xoasv=input.nextInt();
                    list.XoaSV(xoasv);
                    break;
                case 3:
                    System.out.print("Nhập số học sinh cần tìm:");
                    int timsv=input.nextInt();
                    System.out.println("Mã SV \t|Tên SV \t|Ngành học \t|Lớp học \t|Điểm Java \t|Điểm Android \t|Điểm dự án \t|Điểm trung bình ");
                    list.TimSv(timsv);
                    break;
                case 4:
                    System.out.println("-----------------------------------------DANH SÁCH SINH VIÊN--------------------------------------------");
                    System.out.println("Mã SV \t|Tên SV \t|Ngành học \t|Lớp học \t|Điểm Java \t|Điểm Android \t|Điểm dự án \t|Điểm trung bình ");
                    list.XuatDssv();
                    break;
                case 5:
                    System.out.println("Test");
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    break;
                default:
                    System.out.println("");
                    System.out.println("Bạn đã nhập sai ,hãy nhập lại!");
            }
        }while(chon !=8);
    }
}
