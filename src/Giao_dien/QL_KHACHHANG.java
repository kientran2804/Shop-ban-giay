/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giao_dien;

import DAO.KhachHangDAO;
import HELPER.AUTH;
import HELPER.DialogHelper;
import MODEL.KHACHHANG;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PC
 */
public class QL_KHACHHANG extends javax.swing.JDialog {

    /**
     * Creates new form QL_KHACHHANG
     */
    public QL_KHACHHANG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHOTEN = new javax.swing.JTextField();
        txtDIACHI = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtMAKH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbangkhachhang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnlui = new javax.swing.JButton();
        btntoi = new javax.swing.JButton();
        btndau = new javax.swing.JButton();
        btncuoi = new javax.swing.JButton();
        btnmoi1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdoNU = new javax.swing.JRadioButton();
        rdoNAM = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabs.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Mã khách hàng:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Họ tên:");

        txtHOTEN.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtDIACHI.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtMAKH.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtMAKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAKHActionPerformed(evt);
            }
        });

        tblbangkhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Họ tên ", "Giới tính ", "Địa chỉ ", "SDT", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbangkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangkhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbangkhachhang);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        btnthem.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/Add.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/Delete.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/update-icon.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnlui.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnlui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/Left.png"))); // NOI18N
        btnlui.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluiActionPerformed(evt);
            }
        });

        btntoi.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btntoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/Right.png"))); // NOI18N
        btntoi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btntoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntoiActionPerformed(evt);
            }
        });

        btndau.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btndau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/First.png"))); // NOI18N
        btndau.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btndau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndauActionPerformed(evt);
            }
        });

        btncuoi.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btncuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/Last.png"))); // NOI18N
        btncuoi.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuoiActionPerformed(evt);
            }
        });

        btnmoi1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnmoi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HINH/Refresh.png"))); // NOI18N
        btnmoi1.setText("Mới");
        btnmoi1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnmoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmoi1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnlui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btndau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btncuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btntoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btntoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmoi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Điểm:");

        txtDiem.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel7.setText("Giới tính:");

        buttonGroup1.add(rdoNU);
        rdoNU.setText("Nữ");
        rdoNU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNUActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNAM);
        rdoNAM.setText("Nam");
        rdoNAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNAMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMAKH, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT)
                            .addComponent(txtDiem))))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNAM)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNU))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtHOTEN, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(txtDIACHI)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMAKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDIACHI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdoNU)
                    .addComponent(rdoNAM)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Cập Nhật", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)), "Quản Lý Khách Hàng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Helvetica Neue", 3, 24), new java.awt.Color(0, 102, 204))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMAKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAKHActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnmoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoi1ActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnmoi1ActionPerformed

    private void tblbangkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangkhachhangMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            this.row = tblbangkhachhang.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblbangkhachhangMouseClicked

    private void btnluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluiActionPerformed
        // TODO add your handling code here:
        this.prev();
        tblbangkhachhang.setRowSelectionInterval(this.row, this.row);
    }//GEN-LAST:event_btnluiActionPerformed

    private void btntoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntoiActionPerformed
        // TODO add your handling code here:
        this.next();
        tblbangkhachhang.setRowSelectionInterval(this.row, this.row);
    }//GEN-LAST:event_btntoiActionPerformed

    private void btndauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndauActionPerformed
        // TODO add your handling code here:
        this.first();
        tblbangkhachhang.setRowSelectionInterval(this.row, this.row);
    }//GEN-LAST:event_btndauActionPerformed

    private void btncuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuoiActionPerformed
        // TODO add your handling code here:
        this.last();
        tblbangkhachhang.setRowSelectionInterval(this.row, this.row);
    }//GEN-LAST:event_btncuoiActionPerformed

    private void rdoNUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNUActionPerformed

    private void txtDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemActionPerformed

    private void rdoNAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNAMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_KHACHHANG dialog = new QL_KHACHHANG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncuoi;
    private javax.swing.JButton btndau;
    private javax.swing.JButton btnlui;
    private javax.swing.JButton btnmoi1;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNAM;
    private javax.swing.JRadioButton rdoNU;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblbangkhachhang;
    private javax.swing.JTextField txtDIACHI;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHOTEN;
    private javax.swing.JTextField txtMAKH;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
    KhachHangDAO dao = new KhachHangDAO();
    int row = -1;
    
    private void init() {
        this.setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }
    void setForm(KHACHHANG kh){
        txtMAKH.setText(kh.getMAKH());
        txtHOTEN.setText(kh.getHOTEN());
        txtSDT.setText(kh.getSDT());
        txtDIACHI.setText(kh.getDIACHI());
        txtDiem.setText(kh.getDiem());
        rdoNAM.setSelected(kh.getGIOITINH());
        rdoNU.setSelected(!kh.getGIOITINH());
    }
    KHACHHANG getForm(){
        if(Validation()){
            KHACHHANG kh = new KHACHHANG();
            kh.setMAKH(txtMAKH.getText());
            kh.setHOTEN(txtHOTEN.getText());
            kh.setSDT(txtSDT.getText());
            kh.setDIACHI(txtDIACHI.getText());
            kh.setDiem(txtDiem.getText());
            kh.setGIOITINH(rdoNAM.isSelected());
            return kh;
        }
        return null;
    }
    void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tblbangkhachhang.getModel();
        model.setRowCount(0);
        try{
            List<KHACHHANG> list = dao.selectAll();
            for(KHACHHANG kh : list){
                Object[] row = {
                    kh.getMAKH(), kh.getHOTEN(), kh.getGIOITINH() ? "NAM" : "NỮ",
                    kh.getDIACHI(), kh.getSDT(),kh.getDiem()
                };
                model.addRow(row);
            }
        }catch(Exception e){
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    boolean Validation(){
        // kiểm tra mã khách hàng
        if(txtMAKH.getText().length() == 0){
            DialogHelper.alert(this, "bạn chưa nhập mã khách hàng");
            txtMAKH.setFocusable(true);
            return false;
        }
        // kiểm tra họ tên 
        if(txtHOTEN.getText().length() == 0){
            DialogHelper.alert(this, "bạn chưa nhập họ tên khách hàng");
            txtHOTEN.setFocusable(true);
            return false;
        }
        //kiểm tra số điện thoại
        if(txtSDT.getText().length() == 0){
            DialogHelper.alert(this, "bạn chưa nhập Số điện thoại");
            txtSDT.setFocusable(true);
            return false;
        }
        //kiểm tra địa chỉ
        if(txtDIACHI.getText().length() == 0){
            DialogHelper.alert(this, "bạn chưa nhập địa chỉ");
            txtDIACHI.setFocusable(true);
            return false;
        }
        return true;
    }


    void insert(){
        KHACHHANG kh = getForm();
        if(kh == null){
            return;
        }else if(dao.selectById(txtMAKH.getText()) == null){
            try{
                dao.insert(kh);
                this.fillTable();
                this.clearForm();
                DialogHelper.alert(this, "đã thêm khách hàng thành công!");
            }catch(Exception e){
                DialogHelper.alert(this, "thêm khách hàng thất bại");
            }
        }else{
            DialogHelper.alert(this, "mã khách hàng đã tồn tại");
        }
    }
    
    void update(){
        KHACHHANG kh= getForm();
        if(kh == null){
            return;
        }else{
            try{
                dao.update(kh);
                this.fillTable();
                this.clearForm();
                DialogHelper.alert(this, "đã cập nhật thông tin khách hàng thành công!");
            }catch(Exception e){
                DialogHelper.alert(this, "Cập nhật khách hàng thất bại");
            }
        }
    }
    
    void delete(){
        if(!AUTH.isManager()){
            DialogHelper.alert(this, "bạn không có quyền xóa khách hàng");
        }else{
            String makh = txtMAKH.getText();
            if(DialogHelper.confirm(this, "bạn có thực sự muốn xóa khách hàng này")){
                try{
                    dao.delete(makh);
                    this.fillTable();
                    this.clearForm();
                    DialogHelper.alert(this, "Xóa khách hàng thành công!");
                }catch(Exception e){
                    DialogHelper.alert(this, "Xóa khách hàng thất bại");
                }
            }
        }
    } 


    void clearForm(){
        KHACHHANG kh = new KHACHHANG();
        this.setForm(kh);
        this.row = -1;
        this.updateStatus();
        tblbangkhachhang.setColumnSelectionInterval(0, 0);
    }
    void edit(){
        String makh = (String) tblbangkhachhang.getValueAt(this.row, 0);
        KHACHHANG kh = dao.selectById(makh);
        this.setForm(kh);
        tabs.setSelectedIndex(0);
        this.updateStatus();
        
    }
    void updateStatus(){
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblbangkhachhang.getRowCount() -1);
        // trạng thái form 
        txtMAKH.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);
        //trạng thái điều hướng
        btndau.setEnabled(edit && !first);
        btnlui.setEnabled(edit && !first);
        btntoi.setEnabled(edit && !last);
        btncuoi.setEnabled(edit && !last);
    }

    void first(){
        this.row = 0;
        this.edit();
    }
    void prev(){
        if(this.row > 0){
            this.row --;
            this.edit();
        }
    }
    void next(){
        if(this.row < tblbangkhachhang.getRowCount() - 1){
            this.row ++;
            this.edit();
         
        }
    }
    void last(){
        this.row = tblbangkhachhang.getRowCount() - 1;
        this.edit();
    }
    }