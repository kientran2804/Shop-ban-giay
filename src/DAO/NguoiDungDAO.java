/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.jdbcHelper;
import MODEL.NGUOIDUNG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class NguoiDungDAO extends DAO<NGUOIDUNG, String>{
    String INSERT_SQL = "INSERT INTO NGUOIDUNG VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NGUOIDUNG SET HOTEN = ?, MATKHAU = ?, GIOITINH = ?, DIACHI = ?, EMAIL = ?, SDT = ?, ChucVu = ? WHERE MaND = ?";
    String DELETE_SQL = "DELETE FROM NGUOIDUNG WHERE MaND = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NGUOIDUNG";
    String SELECT_BY_ID_SQL = "SELECT * FROM NGUOIDUNG WHERE MaND = ?"; 

    @Override
    public void insert(NGUOIDUNG entity) {
       try{
           jdbcHelper.executeUpdate(INSERT_SQL, entity.getMAND(), entity.getHOTEN(), entity.getMATKHAU() , entity.isGIOITINH(), entity.getDIACHI(),
                   entity.getEMAIL(), entity.getSDT(), entity.isChucVu());
       }catch(Exception ex){
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public void update(NGUOIDUNG entity) {
        try {
            jdbcHelper.executeUpdate(UPDATE_SQL, entity.getHOTEN(), entity.getMATKHAU(),entity.isChucVu(),
                    entity.getDIACHI(), entity.getEMAIL(), entity.getSDT(),entity.isChucVu(), entity.getMAND());
        } catch (Exception ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            jdbcHelper.executeUpdate(DELETE_SQL, id);
        } catch (Exception ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public NGUOIDUNG selectById(String id) {
       List<NGUOIDUNG> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NGUOIDUNG> selectAll() {
         return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NGUOIDUNG> selectBySql(String sql, Object... args) {
         List<NGUOIDUNG> list = new ArrayList<NGUOIDUNG>();
        try{
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                NGUOIDUNG entity = new NGUOIDUNG();
                entity.setMAND(rs.getString("MAND"));
                entity.setHOTEN(rs.getString("HOTEN"));
                entity.setMATKHAU(rs.getString("MATKHAU"));
                entity.setGIOITINH(rs.getBoolean("GIOITINH"));
                entity.setDIACHI(rs.getString("DIACHI"));
                entity.setEMAIL(rs.getString("EMAIL"));
                entity.setSDT(rs.getString("SDT"));
                entity.setChucVu(rs.getBoolean("ChucVu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
