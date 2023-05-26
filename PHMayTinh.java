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
public class PHMayTinh extends PhongHoc{
    private int SoMT;
    
    public PHMayTinh(){}


    public PHMayTinh(String MaPH, String DayNha, double DT, int SBD,int SoMT, LocalDate Ngay) {
        super(MaPH, DayNha, DT, SBD, Ngay);
        this.SoMT = SoMT;
    }

    public int getSoMT() {
        return SoMT;
    }

    public void setSoMT(int SoMT) {
        this.SoMT = SoMT;
    }

    @Override
    public String toString() {
        return super.toString() + "SoMT=" + SoMT + '}';
    }
    
    @Override
    public void ChatLuong(){
        if(this.getDT() == 10 && this.getSBD()==1 && this.SoMT == 7){
            System.out.println("Phong hoc ly thuyet Dat Chuan.");
        }else{
            System.out.println("Phong hoc ly thuyet khong dat chuan.");
        }
    }
}
