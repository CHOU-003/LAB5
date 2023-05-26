/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayph;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachPH {
    Scanner sc = new Scanner(System.in);
    ArrayList<PhongHoc> ds = new ArrayList<>();
    
    public void Nhap(int n) {
    int chon;

    for(int i=0; i<n;i++) {
        System.out.println("0. THOAT !!!");
        System.out.println("1. Nhap phong hoc ly thuyet  vao danh sach.");
        System.out.println("2. Nhap phong hoc may tinh vao danh sach.");
        System.out.println("3. Nhap phong hoc thi nghiem vao danh sach.");

        chon = sc.nextInt();
        sc.nextLine();
        if (chon == 1) {
            System.out.print("Nhap ma PH: ");
            String MaPH = sc.nextLine();
            System.out.print("Nhap day nha: ");
            String DayNha = sc.nextLine();
            System.out.print("Nhap Dien Tich: ");
            double DT = sc.nextDouble();sc.nextLine();
            System.out.print("Nhap so bong den: ");
            int SBD = sc.nextInt();sc.nextLine();
            System.out.print("Nhap may chieu: ");
            String MayChieu = sc.nextLine();
            PHLyThuyet lt  = new PHLyThuyet(MayChieu, MaPH, DayNha, DT, SBD, LocalDate.now());
            ds.add(lt);
        }
        else if (chon == 2) {
            System.out.print("Nhap ma PH: ");
            String MaPH = sc.nextLine();
            System.out.print("Nhap day nha: ");
            String DayNha = sc.nextLine();
            System.out.print("Nhap Dien Tich: ");
            double DT = sc.nextDouble();sc.nextLine();
            System.out.print("Nhap so bong den: ");
            int SBD = sc.nextInt();sc.nextLine();
            System.out.print("Nhap so may tinh: ");
            int SoMT = sc.nextInt();sc.nextLine();
            PHMayTinh mt = new PHMayTinh(MaPH, DayNha, DT, SBD, SoMT, LocalDate.now());
            ds.add(mt);
        }
        else if(chon == 3){
            System.out.print("Nhap ma PH: ");
            String MaPH = sc.nextLine();
            System.out.print("Nhap day nha: ");
            String DayNha = sc.nextLine();
            System.out.print("Nhap Dien Tich: ");
            double DT = sc.nextDouble();sc.nextLine();
            System.out.print("Nhap so bong den: ");
            int SBD = sc.nextInt();sc.nextLine();
            System.out.print("Nhap thong tin chuyen nganh: ");
            String TTCN = sc.nextLine();
            System.out.print("Nhap suc chua: ");
            int SucChua = sc.nextInt();sc.nextLine();
            System.out.println("Nhap bon rua: ");
            String BonRua = sc.nextLine();
            PHThiNghiem tn = new PHThiNghiem(TTCN, SucChua, BonRua, MaPH, DayNha, DT, SBD, LocalDate.now());
            ds.add(tn);
        }
        else if (chon == 0) {
            break;
        } else {
            System.out.println("Tiep tuc!");
            i--;
        }
    }
    }
    
    public void Xuat(){
        for(PhongHoc ph : ds){
            System.out.println(ph);
        }
    }
    
    public void TimKiemP(String ma){
        for(PhongHoc ph : ds){
            if(ph.getMaPH().indexOf(ma) >= 0){
                System.out.println(ph);
            }    
        }
    }
    
    public void sapxepTangDanDN() {
        Collections.sort(this.ds, new Comparator<PhongHoc>() {
             @Override
             public int compare(PhongHoc tp1, PhongHoc tp2) {
                 if(tp1.getDayNha().compareTo(tp2.getDayNha())>0) {
                     return 1;
                 }else if(tp1.getDayNha().compareTo(tp2.getDayNha())<0) {
                     return -1;
                 }else {
                     return 0;
                 }
             }
         });
       }
    
    public void sapxepGiamDanDT() {
    Collections.sort(this.ds, new Comparator<PhongHoc>() {
         @Override
         public int compare(PhongHoc tp1, PhongHoc tp2) {
             if(tp1.getDT() < tp2.getDT()) {
                 return 1;
             } else if(tp1.getDT() > tp2.getDT()) {
                 return -1;
             } else {
                 return 0;
             }
         }
     });
    }
    
    public void sapxepTangDanSBD() {
    Collections.sort(this.ds, new Comparator<PhongHoc>() {
         @Override
         public int compare(PhongHoc tp1, PhongHoc tp2) {
             if(tp1.getSBD() > tp2.getSBD()) {
                 return 1;
             } else if(tp1.getSBD() < tp2.getSBD()) {
                 return -1;
             } else {
                 return 0;
             }
         }
     });
    }
    
    public void TongSoPhongHoc() {
        System.out.println("Tong so Phong Hoc: " + ds.size());
    }
    
    public void XuatPHMayTinh(){
    for(PhongHoc ph : ds){
      if(ph instanceof PHMayTinh) {
         PHMayTinh mt = (PHMayTinh) ph;
         if(mt.getSoMT() > 60) {
            System.out.println(mt);
         }
      }
      }
    }
    
    public void ChinhSuaSoMT(String maPH, int soMTMoi) {
    for(PhongHoc ph : ds){
        if(ph instanceof PHMayTinh && ph.getMaPH().equals(maPH)) {
            PHMayTinh mt = (PHMayTinh) ph;
            mt.setSoMT(soMTMoi);
            System.out.println("Da cap nhat so may tinh cua phong " + maPH + " moi: " + soMTMoi);
            return;
        }
    }
    System.out.println("Khong tim thay phong hoc co ma " + maPH);
    }


    public boolean XoaPH(String MaPH) {
    boolean result = false;
    for(int i = 0; i < ds.size(); i++) {
        if(ds.get(i).getMaPH().equals(MaPH)){
            System.out.println("Phong hoc co ma " + MaPH + " can xoa: ");
            System.out.println(ds.get(i));
            System.out.println("Ban co muon xoa khong? (Y/N)");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("Y")){
                ds.remove(i);
                result = true;
                System.out.println("Da xoa thanh cong!");
                break;
            } else {
                System.out.println("Da huy xoa!");
                break;
            }
        }
    }
    if(!result){
        System.out.println("Khong tim thay phong hoc co ma " + MaPH);
    }
    return result;
}

    public void XuatChatLuong(){
    System.out.println("Cac phong co chat luong:");
    for(PhongHoc ph : ds){
        ph.ChatLuong();
    }
}

}
