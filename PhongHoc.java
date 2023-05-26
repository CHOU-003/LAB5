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
public class PhongHoc {
    private String MaPH;
    private String DayNha;
    private double DT;
    private int SBD;
    private LocalDate Ngay;
    
    public PhongHoc(){}

    public PhongHoc(String MaPH, String DayNha, double DT, int SBD, LocalDate Ngay) {
        this.MaPH = MaPH;
        this.DayNha = DayNha;
        this.DT = DT;
        this.SBD = SBD;
        this.Ngay = Ngay;
    }

    public String getMaPH() {
        return MaPH;
    }

    public void setMaPH(String MaPH) {
        this.MaPH = MaPH;
    }

    public String getDayNha() {
        return DayNha;
    }

    public void setDayNha(String DayNha) {
        this.DayNha = DayNha;
    }

    public double getDT() {
        return DT;
    }

    public void setDT(double DT) {
        this.DT = DT;
    }

    public int getSBD() {
        return SBD;
    }

    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public LocalDate getNgay() {
        return Ngay;
    }

    public void setNgay(LocalDate Ngay) {
        this.Ngay = Ngay;
    }

    @Override
    public String toString() {
        return "PhongHoc: " + "MaPH=" + MaPH + ", DayNha=" + DayNha + ", DT=" + DT + ", SBD=" + SBD + ", Ngay=" + Ngay + " ";
    }
    
    public void ChatLuong(){
        System.out.println("Chat luong các phong la: ");
    }
}
