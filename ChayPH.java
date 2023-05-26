/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chayph;

import  java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class ChayPH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachPH dp = new DanhSachPH();
        int chon = 0;
        
        do {
            System.out.println("-----------DANH SACH Giao Dich----------");
            System.out.println("Chon chuc nang");
            System.out.println("0. Thoat khoi man hinh nhap.\n"
            + "1. Them giao dich.\n"
            + "2. Xuat cac giao dich.\n"
            + "3. Tim kiem phong hoc. \n"
            + "4. Sap xep tang dan theo day nha.\n"
            + "5. Sap xep giam dan theo day dien tich.\n"
            + "6. Sap xep tang dan theo so bong den.\n"
            + "7. Cap nhat so may tinh cua phong may.\n"
            + "8. Xoa phong hoc.\n"
            + "9. Xuat danh sach ph may co tren 60 may tinh.\n"
            + "10. XUAT PHONG HOC CHAT luong dat chuan.\n");

            System.out.print("Lua chon cua ban la: ");
          chon = sc.nextInt();
          sc.nextLine();
          
          if(chon == 0){}
          else if(chon ==1){     
              dp.Nhap(chon);
          }
          else if(chon ==2){
              dp.Xuat();
          }    
          else if(chon ==3){
              System.out.print("Nhap ma phong hoc muon tim: "); String MaPH = sc.nextLine();
              System.out.println("Phong hoc tim duoc la: ");
              dp.TimKiemP(MaPH);
            }
          else if(chon ==4){
              dp.sapxepTangDanDN();
              dp.Xuat();
          }
          else if(chon ==5){
              dp.sapxepGiamDanDT();
              dp.Xuat();
          }
          else if(chon ==6){
              dp.sapxepTangDanSBD();
              dp.Xuat();
          }
          else if(chon ==7){
              System.out.print("Nhap ma phong hoc may tinh: "); String MaPH = sc.nextLine();
              System.out.println("Nhap so may muon chinh sua lai: "); int soMTmoi = sc.nextInt();sc.nextLine();
              dp.ChinhSuaSoMT(MaPH, soMTmoi);
          }
          else if(chon ==8){
              System.out.print("Nhap ma phong hoc may tinh: "); String MaPH = sc.nextLine();
              dp.XoaPH(MaPH);
              dp.Xuat();
          }
          else if(chon == 9){
              dp.XuatPHMayTinh();
          }
          else if(chon == 10){
              dp.XuatChatLuong();
          }
          
        } while (chon !=0);
    }
}
    
