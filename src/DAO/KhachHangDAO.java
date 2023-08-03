/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.jdbcHelper;
import MODEL.KHACHHANG;
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
public class KhachHangDAO extends DAO<KHACHHANG, String>{
    String INSERT_SQL = "INSERT INTO KHACHHANG(MAKH, HOTEN, GIOITINH, DIACHI, SDT,Diem)" +
                        "VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KHACHHANG SET HOTEN = ?, GIOITINH = ?, DIACHI = ?, SDT = ?,Diem = ? WHERE MAKH = ?";
    String DELETE_SQL = "DELETE FROM KHACHHANG WHERE MAKH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KHACHHANG";
    String SELECT_BY_ID_SQL = "SELECT * FROM KHACHHANG WHERE MAKH = ?";
    
    @Override
    public void insert(KHACHHANG entity) {
       try {
            jdbcHelper.executeUpdate(INSERT_SQL, entity.getMAKH(), entity.getHOTEN(), entity.getGIOITINH(), entity.getDIACHI(), entity.getSDT(),entity.getDiem());
        } catch (Exception ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(KHACHHANG entity) {
        try {
            jdbcHelper.executeUpdate(UPDATE_SQL, entity.getHOTEN(), entity.getGIOITINH(), entity.getDIACHI(), entity.getSDT(), entity.getMAKH(),entity.getDiem());
        } catch (Exception ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
       try {
            jdbcHelper.executeUpdate(DELETE_SQL, id);
        } catch (Exception ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public KHACHHANG selectById(String id) {
       List<KHACHHANG> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KHACHHANG> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KHACHHANG> selectBySql(String sql, Object... args) {
       List<KHACHHANG> list = new ArrayList<KHACHHANG>();
        try{
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                KHACHHANG entity = new KHACHHANG();
                entity.setMAKH(rs.getString("MAKH"));
                entity.setHOTEN(rs.getString("HOTEN"));
                entity.setGIOITINH(rs.getBoolean("GIOITINH"));
                entity.setDIACHI(rs.getString("DIACHI"));
                entity.setSDT(rs.getString("SDT"));
                entity.setDiem(rs.getString("Diem"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
        public List<KHACHHANG> selectByKeyword(String keyword){
        String SELECT_BY_NAME_SQL = "SELECT * FROM KHACHHANG WHERE MAKH LIKE ?";
        return this.selectBySql(SELECT_BY_NAME_SQL, "%" + keyword + "%");
    }
}
