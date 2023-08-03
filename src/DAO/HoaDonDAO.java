/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.HOADON;
import HELPER.jdbcHelper;
import MODEL.KHACHHANG;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class HoaDonDAO extends DAO<HOADON, Integer>{
    String INSERT_SQL = "INSERT INTO HOADON (MAHD, TENHANG, SOLUONG, GIA, MAND, MAKH) VALUES(?,?,?,?,?,?)";
    String DELETE_SQL = "DELETE FROM HOADON WHERE MAHD = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM HOADON WHERE MAHD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HOADON";
    String SELECT_MAHD_SQL = "SELECT TOP 1 MAHD FROM HOADON ORDER BY (MAHD) DESC";
    
    public List<HOADON> selectmahd() {
         return this.selectBySql(SELECT_MAHD_SQL);
    }
    @Override
    public void insert(HOADON entity) {
       try{
            jdbcHelper.executeUpdate(INSERT_SQL, entity.getMAHD(), entity.getTENHANG(), entity.getSOLUONG(), entity.getGIA(), entity.getMAND(), entity.getMAKH());
       }catch(Exception ex){
           Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public void update(HOADON entity) {
        
    }

//    @Override
//    public void delete(String id) {
//        try {
//            jdbcHelper.executeUpdate(DELETE_SQL, id);
//        } catch (Exception ex) {
//            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public HOADON selectById(String id) {
//        List<HOADON> list = this.selectBySql(SELECT_BY_ID_SQL, id);
//        if(list.isEmpty()){
//            return null;
//        }
//        return list.get(0);
//    }

    @Override
    public List<HOADON> selectAll() {
         return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<HOADON> selectBySql(String sql, Object... args) {
        List<HOADON> list = new ArrayList<HOADON>();
        try{
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                HOADON entity = new HOADON();
                entity.setMAHD(rs.getInt("MAHD"));
                entity.setTENHANG(rs.getString("TENHANG"));
                entity.setSOLUONG(rs.getInt("SOLUONG"));
                entity.setGIA(rs.getFloat("GIA"));
                entity.setMAND(rs.getString("MAND"));
                entity.setMAKH(rs.getString("MAKH"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer id) {
         try {
            jdbcHelper.executeUpdate(DELETE_SQL, id);
        } catch (Exception ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HOADON selectById(Integer id) {
        List<HOADON> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
}
