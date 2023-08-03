/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.jdbcHelper;
import MODEL.CHITIETHOADON;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Thinh
 */
public class ChiTietHoaDonDAO extends DAO<CHITIETHOADON, String>{
    String INSERT_SQL = "INSERT INTO CHITIETHOADON (MAHD, MASP, NGAYBAN) VALUES(?,?,?)";

    @Override
    public void insert(CHITIETHOADON entity) {
        try{
            jdbcHelper.executeUpdate(INSERT_SQL, entity.getMAHD(), entity.getMASP(), entity.getNGAYBAN());
       }catch(Exception ex){
           Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public void update(CHITIETHOADON entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CHITIETHOADON selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CHITIETHOADON> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<CHITIETHOADON> selectBySql(String sql, Object... args) {
        List<CHITIETHOADON> list = new ArrayList<CHITIETHOADON>();
        try{
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                CHITIETHOADON entity = new CHITIETHOADON();
                entity.setMAHD(rs.getInt("MAHD"));
                entity.setMASP(rs.getString("MASP"));
                entity.setNGAYBAN(String.valueOf(rs.getDate("NGAYBAN")));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    
    
}
