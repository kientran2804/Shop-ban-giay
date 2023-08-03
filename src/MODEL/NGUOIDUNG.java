/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author PC
 */
public class NGUOIDUNG {
    private String MAND;
    private String HOTEN;
    private String MATKHAU;
    private boolean GIOITINH;
    private String DIACHI;
    private String EMAIL;
    private String SDT;
    private boolean ChucVu;
 

    public NGUOIDUNG() {
    }

    public NGUOIDUNG(String MAND, String HOTEN, String MATKHAU, boolean GIOITINH, String DIACHI, String EMAIL, String SDT, boolean ChucVu) {
        this.MAND = MAND;
        this.HOTEN = HOTEN;
        this.MATKHAU = MATKHAU;
        this.GIOITINH = GIOITINH;
        this.DIACHI = DIACHI;
        this.EMAIL = EMAIL;
        this.SDT = SDT;
        this.ChucVu = ChucVu;
    }

    public String getMAND() {
        return MAND;
    }

    public void setMAND(String MAND) {
        this.MAND = MAND;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public boolean isGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(boolean GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }


}
