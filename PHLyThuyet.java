/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayph;

import java.time.LocalDate;

/**
 *
 * @author DINH CHAU
 */
public class PHLyThuyet extends PhongHoc {
    private String MayChieu;
    
    public PHLyThuyet(){}

    public PHLyThuyet(String MayChieu, String MaPH, String DayNha, double DT, int SBD, LocalDate Ngay) {
        super(MaPH, DayNha, DT, SBD, Ngay);
        this.MayChieu = MayChieu;
    }

    public String getMayChieu() {
        return MayChieu;
    }

    public void setMayChieu(String MayChieu) {
        this.MayChieu = MayChieu;
    }

    @Override
    public String toString() {
        return super.toString() + "MayChieu=" + MayChieu + '}';
    }
    
    @Override
    public void ChatLuong(){
        if(this.getDT() == 10 && this.getSBD()==1 && this.MayChieu == "Co"){
            System.out.println("Phong hoc ly thuyet Dat Chuan.");
        }else{
            System.out.println("Phong hoc ly thuyet khong dat chuan.");
        }
    }
}
