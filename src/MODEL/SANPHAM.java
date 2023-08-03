/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author PC
 */
public class SANPHAM {
     private String MASP;
     private String TENSP;       
     private double GIA;     
     private int   SOLUONG;    
     private Date NGAYNHAP;
     private Date HANSUDUNG;
     private String XUATXU;
     private String MOTA;
     private String MAND;
     private String HINH;

       @Override
    public String toString(){
        return this.toString();
    }

    public SANPHAM() {
    }
    
    public SANPHAM(String MASP, String TENSP, double GIA, int SOLUONG, Date NGAYNHAP, Date HANSUDUNG, String XUATXU, String MOTA, String MAND) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.GIA = GIA;
        this.SOLUONG = SOLUONG;
        this.NGAYNHAP = NGAYNHAP;
        this.HANSUDUNG = HANSUDUNG;
        this.XUATXU = XUATXU;
        this.MOTA = MOTA;
        this.MAND = MAND;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public double getGIA() {
        return GIA;
    }

    public void setGIA(double GIA) {
        this.GIA = GIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public Date getNGAYNHAP() {
        return NGAYNHAP;
    }

    public void setNGAYNHAP(Date NGAYNHAP) {
        this.NGAYNHAP = NGAYNHAP;
    }

    public Date getHANSUDUNG() {
        return HANSUDUNG;
    }

    public void setHANSUDUNG(Date HANSUDUNG) {
        this.HANSUDUNG = HANSUDUNG;
    }

    public String getXUATXU() {
        return XUATXU;
    }

    public void setXUATXU(String XUATXU) {
        this.XUATXU = XUATXU;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }

    public String getMAND() {
        return MAND;
    }

    public void setMAND(String MAND) {
        this.MAND = MAND;
    }
     
    public String getHINH() {
        return HINH;
    }

    public void setHINH(String HINH) {
        this.HINH = HINH;
    }

    public Object getSTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getTHANHTIEN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
