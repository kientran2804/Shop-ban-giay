/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.jdbcHelper;
import MODEL.KHACHHANG;
import MODEL.SANPHAM;
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
public class SanPhamDAO extends DAO<SANPHAM , String>{
    
     String INSERT_SQL = "INSERT INTO SANPHAM(MASP, TENSP, GIA, SOLUONG, NGAYNHAP, HANSUDUNG, XUATXU, MOTA, MAND, HINH)" +
                        "VALUES(?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SANPHAM SET  TENSP = ?, GIA = ?, SOLUONG = ?, NGAYNHAP = ?, HANSUDUNG = ?, XUATXU = ?, MOTA = ?, MAND = ?, HINH = ? WHERE MASP = ?";
    String DELETE_SQL = "DELETE FROM SANPHAM WHERE MASP = ?";
    
    
    String SELECT_ALL_SQL = "SELECT * FROM SANPHAM";
    String SELECT_BY_ID_SQL = "SELECT * FROM SANPHAM WHERE MASP = ?";
    
    @Override
    public void insert(SANPHAM entity) {
       try {
            jdbcHelper.executeUpdate(INSERT_SQL, entity.getMASP(), entity.getTENSP(), entity.getGIA(), entity.getSOLUONG(),
                    entity.getNGAYNHAP(), entity.getHANSUDUNG(), entity.getXUATXU(), entity.getMOTA(), entity.getMAND(), entity.getHINH());
        } catch (Exception ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SANPHAM entity) {
        try {
        jdbcHelper.executeUpdate(UPDATE_SQL, entity.getTENSP(), entity.getGIA(), entity.getSOLUONG(),
                    entity.getNGAYNHAP(), entity.getHANSUDUNG(), entity.getXUATXU(), entity.getMOTA(), entity.getMAND(), entity.getHINH(), entity.getMASP());
        } catch (Exception ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void delete(String id) {
        try {
            jdbcHelper.executeUpdate(DELETE_SQL, id);
        } catch (Exception ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public SANPHAM selectById(String id) {
        List<SANPHAM> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SANPHAM> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<SANPHAM> selectBySql(String sql, Object... args) {
       List<SANPHAM> list = new ArrayList<SANPHAM>();
        try{
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                SANPHAM entity = new SANPHAM();
                entity.setMASP(rs.getString("MASP"));
                entity.setTENSP(rs.getString("TENSP"));
                entity.setGIA(rs.getDouble("GIA"));
                entity.setSOLUONG(rs.getInt("SOLUONG"));
                entity.setNGAYNHAP(rs.getDate("NGAYNHAP"));
                entity.setHANSUDUNG(rs.getDate("HANSUDUNG"));
                entity.setXUATXU(rs.getString("XUATXU"));
                entity.setMOTA(rs.getString("MOTA"));
                entity.setMAND(rs.getString("MAND"));
                entity.setHINH(rs.getString("HINH"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
     public List<SANPHAM> selectByKeyword(String keyword){
        String SELECT_BY_NAME_SQL = "SELECT * FROM SANPHAM WHERE TENSP LIKE ?";
        return this.selectBySql(SELECT_BY_NAME_SQL, "%" + keyword + "%");
    }

    public void update(KHACHHANG HD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public KHACHHANG selectAll(String DC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


    

