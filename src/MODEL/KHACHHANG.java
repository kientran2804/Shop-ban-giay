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
public class KHACHHANG {
    private String MAKH;
    private String HOTEN;
    private boolean GIOITINH = true; 
    private String DIACHI;
    private String SDT;
    private String Diem;

      @Override
    public String toString(){
        return this.toString();
    }

    
    public KHACHHANG() {
    }

    public KHACHHANG(String MAKH, String HOTEN, boolean GIOITINH, String DIACHI, String SDT ,String Diem) {
        this.MAKH = MAKH;
        this.HOTEN = HOTEN;
        this.GIOITINH = GIOITINH;
        this.DIACHI = DIACHI;
        this.SDT = SDT;
        this.Diem = Diem;
    }
   
    
    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public boolean getGIOITINH() {
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public String getDiem() {
        return Diem;
    }
    public void setDiem(String Diem){
        this.Diem=Diem;
    }
    
}
