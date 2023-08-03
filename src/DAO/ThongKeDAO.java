/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trung
 */
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql,String[] cols, Object...args){
//        try{
//            List<Object[]> list=new ArrayList<>();
//            ResultSet rs = jdbcHelper.executeQuery(sql,args);
//            while(rs.next()){
//                Object[]vals = new Object[cols.length];
//                for(int i=0; i<cols.length; i++){
//                   vals[i] = rs.getObject(cols[i]); 
//                }
//                list.add(vals);
//            }
//            rs.getStatement().getConnection().close();
//            return list;
//        }
//        catch (Exception e){
//
//            throw new RuntimeException(e);
//        }
    try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = jdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0;i<cols.length;i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
} 

    
public List<Object[]> getDoanhThu( ){
//    String sql = "{CALL SP_THONGKEDT(?)}";
//    String[] cols = {"MASP","TENSP","SOLUONG","GIA","TONG"};
//    return this.getListOfArray(sql,cols,ngay_thang_nam);
    String sql = "{CALL SP_THONGKEDT_TK_3}";
    String[] cols = {"MASP","TENSP","SOLUONG","GIA","TONG"};
    return this.getListOfArray(sql,cols);
    }

}
    

