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
public class HOADON {
    private int MAHD;
    private String TENHANG;
    private int SOLUONG;
    private float GIA;
    private String MAND;
    private String MAKH;

    public HOADON(int MAHD, String TENHANG, int SOLUONG, float GIA, String MAND, String MAKH) {
        this.MAHD = MAHD;
        this.TENHANG = TENHANG;
        this.SOLUONG = SOLUONG;
        this.GIA = GIA;
        this.MAND = MAND;
        this.MAKH = MAKH;
    }

    public HOADON() {
    }

    public int getMAHD() {
        return MAHD;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public String getTENHANG() {
        return TENHANG;
    }

    public void setTENHANG(String TENHANG) {
        this.TENHANG = TENHANG;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public float getGIA() {
        return GIA;
    }

    public void setGIA(float GIA) {
        this.GIA = GIA;
    }

    public String getMAND() {
        return MAND;
    }

    public void setMAND(String MAND) {
        this.MAND = MAND;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }


    
    
    
}
