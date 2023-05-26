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
public class PHThiNghiem extends PhongHoc{
    private String TTCN;
    private int SucChua;
    private String BonRua;
    
    public PHThiNghiem(){}
    
    public PHThiNghiem(String TTCN, int SucChua, String BonRua, String MaPH, String DayNha, double DT, int SBD, LocalDate Ngay) {
        super(MaPH, DayNha, DT, SBD, Ngay);
        this.TTCN = TTCN;
        this.SucChua = SucChua;
        this.BonRua = BonRua;
    }

    public String getTTCN() {
        return TTCN;
    }

    public void setTTCN(String TTCN) {
        this.TTCN = TTCN;
    }

    public int getSucChua() {
        return SucChua;
    }

    public void setSucChua(int SucChua) {
        this.SucChua = SucChua;
    }

    public String getBonRua() {
        return BonRua;
    }

    public void setBonRua(String BonRua) {
        this.BonRua = BonRua;
    }

    @Override
    public String toString() {
        return super.toString() + "TTCN=" + TTCN + ", SucChua=" + SucChua + ", BonRua=" + BonRua + '}';
    }
    
    @Override
    public void ChatLuong(){
        if(this.getDT() == 10 && this.getSBD()==1 && this.BonRua == "RuaTay" && this.BonRua == "RuaDungCuThiNghiem"){
            System.out.println("Phong hoc ly thuyet Dat Chuan.");
        }else{
            System.out.println("Phong hoc ly thuyet khong dat chuan.");
        }
    }
    
}
